var a = 10;
console.log(typeof(a));
console.log(isNaN(a));
var b = "2010";
console.log(parseFloat(b)+5);
console.log(parseInt(b)+5);
var c = "3 + 5 - 8 * 2 / 2";
console.log(eval(c));
var b = "2010.95ABC";
console.log(parseInt(b)+5);
console.log(parseFloat(b)+5);

var i = 0;
function abc() {
    console.log("Hello : "+i);   
}

setTimeout(() => {
    abc();
}, 5000);

var ref = setInterval(() => {
    i++;
    abc();
}, 2000);

setTimeout(()=>{
    clearInterval(ref);
}, 15000);