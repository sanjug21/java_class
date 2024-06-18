
// // foreach, map, filter
// let arr=[10,20,30,40,50];
// arr.forEach(function(item,index){
//     console.log(index,item);
// })
// let newArr=arr.map(function(item,index){
//     return item*2;
// })
// console.log(arr,newArr)

// let filterArr=arr.filter(function(item,index){
//     if(item>30)return true;
// })
// console.log(filterArr)


//------------------------------------------------------------------------------------------------------------------------------------------------


// closures
/* whenever you return a function that function is never rerturned alone it always takes along the lexical environment with itso that if in future 
 we ever want to run that returned function then it should not throw an error

 use case of closure
 before the class santax was introduced we had no way to privatise our variable or functions so in that case we used closures so that we can 
 privatised the variable
*/

// function outer(){
//     let a=100;
//     let b=200;
//     function inner(){
//         console.log(a)
//     }
//     inner();
// }
// let out=outer();
// out()



//------------------------------------------------------------------------------------------------------------------------------------------------


// function counter(){
//     let count=0;
//     return{
//         getCount: function(){
//             console.log(count)
//         },
//         increment: function(){
//             count++;
//         },
//         decrement: function(){
//             count--;
//         }
//     };
// }
// let cout=counter();
// cout.increment();
// cout.getCount();
// console.log(cout)



//------------------------------------------------------------------------------------------------------------------------------------------------



// //Prototype
// // denderProto
// let obj={
//     a:23,
//     b:"Sanju",
//     c:function(){
//         console.log("Singh")
//     }
// }
// console.log(obj.b)
// console.log(obj.c())
// let ar=[10,20,30];

// // normal function
// function sam(){

// }
// let oob=sam()
// console.log(oob)



//------------------------------------------------------------------------------------------------------------------------------------------------



// //constructor function
// function sam(){
// this.naam="cashew"
// this.age=2
// // in constuctor function we never return anything
// }
// let ob=new sam()
// console.log(ob)


//------------------------------------------------------------------------------------------------------------------------------------------------


// //arraow funvtion
// let sum=(a,b)=>{return a+b};

// let sum2=(x,y,z)=> x+y+z;

// let sqr=a=> a*a
// let ans=sqr(6)

// let obj1={
//     a:"sanju",
//     b: function(){
//         return (this)
//     }
// }

// let answ=obj1.b
// ans()

// let obj2={
//     a:10,
//     fn:function(){
//         function sam(){
//             console.log(this)
//         }
//         let a=sam()
//         return a
//     }
// }
// let answer=obj2.fn()
// answer()



//------------------------------------------------------------------------------------------------------------------------------------------------



// set timeout
// console.log("start");
// setTimeout(function(){console.log("after 4 sec")},4*1000)
// console.log("end")



// //Prototype
// // denderProto
// let obj={
//     a:23,
//     b:"Sanju",
//     c:function(){
//         console.log("Singh")
//     }
// }
// console.log(obj.b)
// console.log(obj.c())
// let ar=[10,20,30];



//------------------------------------------------------------------------------------------------------------------------------------------------


// // normal function
// function sam(){

// }
// let oob=sam()
// console.log(oob)

// //constructor function
// function sam(){
// this.naam="cashew"
// this.age=2
// }
// let ob=new sam()
// console.log(ob)



//------------------------------------------------------------------------------------------------------------------------------------------------


// setTimeout(function(){console.log("hi bhai")},1000);

// let id=setInterval(function(){console.log('Jiyan hai aap')},3000);

// setTimeout(function(){clearInterval(id);},15000);


// function printNumbersWithDelay() {
//     let i = 1;
//     const interval = setInterval(() => {
//         console.log(i);
//         i++;
//         if (i > 5) {
//             clearInterval(interval);
//         }
//     }, 2000);
// }

// printNumbersWithDelay();

//------------------------------------------------------------------------------------------------------------------------------------------------


// function printNumbersWithDelay() {
//     let i = 1;
//     function printNumber() {
//         console.log(i);
//         i++;
//         if (i <= 5) {
//             setTimeout(printNumber, 2000);
//         }
//     }
//     printNumber();
// }

// printNumbersWithDelay();

//--------------------------------------------------------------------------------------------------------------------------------------------------


// constructor function


// function Person(name,age,color){
//     this.name=name
//     this.age=age;
//     this.color=color
// }
// Person.prototype.fn=function(){console.log("hi")}
// let p=new Person("sanju",22,"Red");

// let p1=new Person("shubham",22,"Red");
// console.log(p.fn)
// console.log(p1)

// let obj={
//     a:10,
//     b:function(){
//         console.log("raj")
//     }
// }
// console.log(obj);
// console.log(obj.a);
// console.log(obj);
// obj.b();
// obj.c();
// console.log(obj.toString());


//----------------------------------------------------------------------------------------------------------------------------------------------------
class Person{
    constructor(name,age,color){
        this.name=name
        this.age=age;
        this.color=color
    }
    fn(){
        console.log("hi")
    }
    greet(){
        return "Radhe Radhe"
    }
}
class Student extends Person{
    constructor(name,age,color,batch){
        super(name,age,color)
        this.batch=batch
    }

}
let p=new Student("shubham",22,"Red",1);
console.log(p)