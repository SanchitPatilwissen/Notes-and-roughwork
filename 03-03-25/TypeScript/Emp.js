var __extends = (this && this.__extends) || (function () {
    var extendStatics = function (d, b) {
        extendStatics = Object.setPrototypeOf ||
            ({ __proto__: [] } instanceof Array && function (d, b) { d.__proto__ = b; }) ||
            function (d, b) { for (var p in b) if (Object.prototype.hasOwnProperty.call(b, p)) d[p] = b[p]; };
        return extendStatics(d, b);
    };
    return function (d, b) {
        if (typeof b !== "function" && b !== null)
            throw new TypeError("Class extends value " + String(b) + " is not a constructor or null");
        extendStatics(d, b);
        function __() { this.constructor = d; }
        d.prototype = b === null ? Object.create(b) : (__.prototype = b.prototype, new __());
    };
})();
var Emp = /** @class */ (function () {
    function Emp(name, age) {
        this.name = name;
        this.age = age;
    }
    Emp.prototype.display = function () {
        console.log("Name : " + this.name);
        console.log("Age : " + this.age);
    };
    return Emp;
}());
var Clerk = /** @class */ (function (_super) {
    __extends(Clerk, _super);
    function Clerk(name, age, salary, designation) {
        var _this = _super.call(this, name, age) || this;
        _this.salary = salary;
        _this.designation = designation;
        return _this;
    }
    Clerk.prototype.displayAll = function () {
        this.display();
        console.log("Salary : " + this.salary);
        console.log("Designation : " + this.designation);
    };
    return Clerk;
}(Emp));
var e1 = new Clerk("Roohi", 25, 40000, "Programmar");
var e2 = new Clerk("Aditya", 32, 100000, "Tester");
e1.display();
e2.displayAll();
var A = /** @class */ (function () {
    function A() {
        console.log("A()");
    }
    return A;
}());
var B = /** @class */ (function (_super) {
    __extends(B, _super);
    function B() {
        var _this = _super.call(this) || this; // super class constructor is not called by default in typescript just like java.
        console.log("B()");
        return _this;
    }
    return B;
}(A));
var a1 = new B();
var HatchBack = /** @class */ (function () {
    function HatchBack() {
    }
    HatchBack.prototype.accelerate = function () {
        console.log("Accelerator : " + ++this.speed);
    };
    HatchBack.prototype.brake = function () {
        console.log("Decelerator : " + --this.speed);
    };
    return HatchBack;
}());
var h1 = new HatchBack();
h1.accelerate();
h1.accelerate();
h1.accelerate();
h1.brake();
var m1 = { "company": "Maruti Suzuki", "model": "Brezza", "price": 800000, "display": function (emp) {
        console.log("Hello from this car " + emp);
        return 1;
    } };
console.log(m1.display("sanchit"));
