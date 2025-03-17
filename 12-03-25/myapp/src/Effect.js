import { useEffect, useState } from "react";

function Effect() {
    const [a, setA] = useState(0);
    const [b, setB] = useState(0);

    function updateA() {
        setA(a+1);
    }

    function updateB() {
        setB(b+1);
    }

    useEffect(()=>{
        console.log("Component mounted successfully!"); // whenever a component is mounted this is being called. 
    }, [a]); // On putting an empty list as argument this statement is printed only once.
    return (
        <div>
            <hr></hr>
            <h2>This is from Effect component</h2>
            <h3>A : {a}</h3>
            <h3>B : {b}</h3>
            <button onClick={updateA}>Increment A</button>
            <button onClick={updateB}>Increment B</button>
        </div>
    );
}

export default Effect;