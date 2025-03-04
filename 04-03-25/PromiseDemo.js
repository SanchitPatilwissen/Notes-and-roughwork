let s1 = "Wissen"
let s2 = "Technology"

var promise = new Promise((resolved, rejected)=>{
    if((s1+s2) === "Wissenechnology")
        resolved();
    else
        rejected();
});

promise
    .then(
        ()=>{
            console.log("Best Place to work!");
        },
        ()=>{
            console.log("There is some spelling mistake!");
        }
    )
    .catch(
        (err)=>{
            console.log(err); // executed when something goes wrong.
        }
    )
    .finally(
        ()=>{
            console.log("ThankYou");
        }
    );