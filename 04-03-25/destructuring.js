let emp= {"name" : "Prakash", "age" : 35, "salary" : 60000, "designation" : "Tester"};
let emp1= ["Prakash", 35, 60000, "Tester"];


let {name, age, salary, designation} = emp;
let [ename, eage, esalary, edesignation] = emp1;

console.log("Name : "+name);
console.log("Age : "+age);
console.log("Salary : "+salary);
console.log("Designation : "+designation);

console.log("-------------------------------------------");

console.log("Name : "+ename);
console.log("Age : "+eage);
console.log("Salary : "+esalary);
console.log("Designation : "+edesignation);

console.log("-------------------------------------------");

let arr1 = [1, 2, 3];
let arr2 = [4, 5, 6, 7];
let arr3 = [8, 9, 10];

let arr = [arr1, arr2, arr3];
let arr_f = [...arr1, ...arr2, arr3];

console.log(arr);
console.log(arr_f);


