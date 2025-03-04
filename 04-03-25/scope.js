function abc() {
    {
        a = 10; // without var it is global
        var b = 11;
        let c = 12;
        
    }
    console.log("From inside a value is : "+a);
    console.log("From inside b value is : "+b);
    // console.log("From inside c value is : "+c);
    
}

abc();
console.log("From outside a value is : "+a);
// console.log("From outside b value is : "+b);
// console.log("From outside c value is : "+c);
