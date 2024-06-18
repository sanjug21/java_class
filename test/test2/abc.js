//task 1
// 1. This: Write a JavaScript function that illustrates how this behaves differently in arrow functions compared to regular functions.


obj = {
    name: 'Sanju',
    age: 22,
    print: function() {
        console.log(this);
    },
    printArrow: name=>console.log(this)
    
};
obj.print();
obj.printArrow();

// 2. Hoisting: Implement a code snippet showing hoisting in a nested function scope.


function outerHost(){
    var age=20;
    function innerHost(){
        console.log(age);
    }
    return innerHost;
}
var print=outerHost();
print();

// 3. Prototype: Create a parent object with shared properties and methods, and child objects that inherit from it using prototypal inheritance.

var vehicle={
    color:"red",
    company(){
        console.log('tata')
    }
}
var car={
    name:"harrier",
    __proto__:vehicle
}
car.company()

// 4. Scope: Write a code snippet to show the difference between accessing variables in global scope and local scope.

var age=20;
{
   name="sanju"
}
console.log(name)
console.log(age);


// 2nd task
// 1st code
function outer() {
    let outerVar = 'I am from outer function';
    function inner() {
    console.log(outerVar);
    }
    inner();
    }
outer();


// 2nd code
function Person(name, age) {
    this.name = name;
    this.age = age;
}

Person.prototype.greet = function() {
    console.log(`Hello, my name is ${this.name} and I'm ${this.age} years old`);
};

const john = new Person('John', 30);
john.greet();
