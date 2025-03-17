import useCounter from "./useCounter";

function FirstComp() {
    const [ cnt, incr, decr ] = useCounter();

    return (
        <div>
            <h2>First Component</h2>
            <span>Count : {cnt}</span><br></br>
            <button onClick={()=>incr()}>Increment</button>
            <button onClick={()=>decr()}>Decrement</button>

        </div>
    );
}

export default FirstComp;