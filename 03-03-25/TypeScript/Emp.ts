class Emp{
    private name:string;
    private age:number;
    
    public constructor(name:string, age:number){
        this.name = name;
        this.age = age;
    }

    public display() {
        console.log("Name : "+this.name);
        console.log("Age : "+this.age);    
    }
}

class Clerk extends Emp{
    salary:number;
    designation:string;

    constructor(name:string, age:number, salary:number, designation:string){
        super(name, age);
        this.salary = salary;
        this.designation = designation;
    }

    displayAll(){
        this.display();
        console.log("Salary : "+this.salary);
        console.log("Designation : "+this.designation);
    }
}

var e1 = new Clerk("Roohi", 25, 40000, "Programmar");
var e2 = new Clerk("Aditya", 32, 100000, "Tester");
e1.display();
e2.displayAll();

class A{
    constructor(){
        console.log("A()");
    }
}

class B extends A{
    constructor(){
        super(); // super class constructor is not called by default in typescript just like java.
        console.log("B()");
    }
}

var a1 = new B();

interface Car{
    speed : number; // In java variables must be initialized because they are static and constant but not in case of type script
    accelerate() : void;
    brake() : void;

}

class HatchBack implements Car{
    speed: number;

    accelerate(): void {
        console.log("Accelerator : "+ ++this.speed);
    }

    brake(): void {
        console.log("Decelerator : "+ --this.speed);
    }
}

let h1 = new HatchBack();
h1.accelerate();
h1.accelerate();
h1.accelerate();
h1.brake();

interface CarProperties{
    company:string;
    model:string;
    price:number;
    gear?:boolean; // gear is optional
    display(emp):void;
}

let m1:CarProperties = {"company" : "Maruti Suzuki", "model" : "Brezza", "price" : 800000, "display":(emp)=>{
    console.log("Hello from this car "+emp);
    return 1;
}};
console.log(m1.display("sanchit"));

console.log("-----------------------------------------");

let arr:number[] = [11, 22, 33, 44, 55];
let arr2:Array<number> = [11, 22, 33, 44, 55];
arr.push(66);

