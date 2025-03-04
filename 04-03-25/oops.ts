class Person {
    name:string;
    constructor(name) {
        console.log("Start of constructor!");
        this.name = name;
        setTimeout(()=>{
            console.log("From within constructor : "+this.name); // Arrow function doesn't create its own this object.
        }, 5000);
        console.log("End of Constructor!");
    }
}

new Person("Ramesh");
console.log("End of program");
