import { useRef, useState } from "react";

function Welcome() {
    const [name, setName] = useState("Guest");

    const refElement = useRef("");

    function clearFields(e) {
        setName("");
        refElement.current.focus();
    }

    return (
        <div>
            <hr></hr>
            <h2>Welcome ! {name}</h2>
            <div>
                <input ref={refElement} type="text" value={name} onChange={(e)=>setName(e.target.value)}></input>
                <input type="reset" value="CLEAR" onClick={clearFields}></input>
            </div>
        </div>
    );
}

export default Welcome;