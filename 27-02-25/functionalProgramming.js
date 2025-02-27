function xyz() {
    console.log("From xyz function!");
}

function abc() {
    console.log("From abc function");
    return xyz;
}

function demo1(op){
    console.log("From function demo1()");
    op()();
}

demo1(abc);
