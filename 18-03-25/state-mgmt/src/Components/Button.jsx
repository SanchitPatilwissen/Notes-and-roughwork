import React from 'react'
import CompA from './CompA'
import CompB from './CompB'

function Button({count}) {
    return (
        <div>
            <h2>Clickable Button</h2>
            <button>CLICK HERE</button>
            <CompA></CompA>
            <CompB></CompB>
        </div>
    )
}

export default Button