import {useState} from "react";

function Counter() {
    const [count, setCount] = useState(0);

    function incrCounter() {
        setCount(count+1);
        console.log(count);
    }

    function decrCounter() {
        setCount(count-1);
        console.log(count);
    }

    function setCountToZero() {
        setCount(0);
    }

    return (
        <div>
            <h2>State Demo</h2>
            <h3>Counter : {count}</h3>
            <button onClick={incrCounter}>INCREMENT</button>
            <button onClick={decrCounter}>DECREMENT</button>
            <button onClick={setCountToZero}>RESET</button>
        </div>
    );
}

export default Counter;