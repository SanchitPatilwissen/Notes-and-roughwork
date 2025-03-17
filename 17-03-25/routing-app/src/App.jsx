import { useState } from 'react'
import { Routes, Route } from 'react-router-dom'
import Home from './screens/Home'
import AboutUs from './screens/AboutUs'
import Contact from './screens/Contact'

function App() {
  const [count, setCount] = useState(0)

  return (
    <>
      <Routes>
        <Route path="/" element={<Home />}></Route>
        <Route path="/about" element={<AboutUs />}></Route>
        <Route path="/contact" element={<Contact />}></Route>
      </Routes>
    </>
  )
}

export default App
