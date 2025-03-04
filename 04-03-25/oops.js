var Person = /** @class */ (function () {
    function Person(name) {
        var _this = this;
        console.log("Start of constructor!");
        this.name = name;
        setTimeout(function () {
            console.log("From within constructor : " + _this.name); // Arrow function doesn't create its own this object.
        }, 5000);
        console.log("End of Constructor!");
    }
    return Person;
}());
new Person("Ramesh");
console.log("End of program");
