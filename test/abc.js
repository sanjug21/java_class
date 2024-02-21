// code 1
function outer(){
    var message="hello from outer function!";
    function inner(){
        console.log(message);
    }
    return inner;
}
let innerFunc=outer();
innerFunc();



// code 2
console.log(myLet);
console.log("hi");
let myLet;

