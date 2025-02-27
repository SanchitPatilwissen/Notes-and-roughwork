// rest operator
function add(...a){
    var res = 0;
    for(var i=0;i<a.length;i++)
        res += a[i];
    console.log(res);
}

add(10, 20);
add(10, 20, 30);

// spread operator
function display(name, age, salary, designation){
    console.log(name);
    console.log(age);
    console.log(salary);
    console.log(designation);
}

var emp = ["Sanchit", 22, 50000, "Programmar"];

display(...emp);