
function display(obj) {
    console.log("Name : "+obj.name);
    console.log("Name : "+obj.age);
    console.log("Name : "+obj.salary);
    console.log("Name : "+obj.designation);
    console.log("----------------------");
    
    
}

console.log("1. Using Object as a constructor ---->")
var emp1 = new Object();
emp1.name = "Raju";
emp1.age = 25;
emp1.salary = 30000;
emp1.designation = "Tester";

display(emp1);

console.log("2) Using function as a constructor ---->");

function employee(n, a, s, d){
    this.name = n;
    this.age = a;
    this.salary = s;
    this.designation = d;
}

var emp2 = new employee("Sunita", 34, 30000, "Programmar");
display(emp2);

console.log("3) Using json type ---->");

var emp3 = {
    "name" : "Ravi",
    "age" : 44,
    "salary" : 100000,
    "designation" : "Manager"
}

display(emp3);

console.log("4) Using ES6 classes");

class Employee {
    constructor(n, a, s, d) {
        this.name = n;
        this.age = a;
        this.salary = s;
        this.designation = d;
    }
}

var emp4 = new Employee("Kaif", 22, 25000, "Programmar");
display(emp4);


