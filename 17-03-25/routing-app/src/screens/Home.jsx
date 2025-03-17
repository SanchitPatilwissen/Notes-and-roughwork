import React from "react";
import Header from "../components/Header";
import Footer from "../components/Footer";
import { Link, useNavigate } from "react-router-dom";

function Home() {
  let flag = false;

  const navigate = useNavigate();

  function goTo(){
    if(flag){
      navigate("/contact");
    }
    else{
      navigate("/about");
    }
  }

  return (
    <div>
      <Header/>
      <h2>Home</h2>
      <Link to="/about">About</Link><br></br>
      <button onClick={goTo}>contact</button>
      <Footer/>
    </div>
  );
}

export default Home;
