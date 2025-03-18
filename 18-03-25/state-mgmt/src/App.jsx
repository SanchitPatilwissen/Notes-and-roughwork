import { useState } from 'react'
import Menu from './components/Menu'
import counterCtx from './state/context'

function App() {
  const [count, setCount] = useState(0)

  return (
    <>
      <counterCtx.Provider value={count}>
        <Menu count={count}></Menu>
      </counterCtx.Provider>
    </>
  )
}

export default App
