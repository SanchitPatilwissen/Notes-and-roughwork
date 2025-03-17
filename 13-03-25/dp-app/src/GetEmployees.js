import axios from "axios";
import { useEffect, useState } from "react";
 
 
function GetEmployees(){
   
   const [employees , setEmployees] =useState([])
 
    useEffect(()=>{
        axios.get("http://localhost:4000/employees")
        .then((resp)=>{
           // console.log(resp);
           setEmployees(resp.data)
        }
        )
    },[]);

    const deleteEmployee = (e,id) =>{
        let confirmDelete = window.confirm("Are you sure you want to delete this employee?");
        if(!confirmDelete){
            return;
        }
        axios.delete(`http://localhost:4000/employees/${id}`)
        .then((resp)=>{
            console.log(resp);
            setEmployees(employees.filter((emp)=>emp.id !== id))
        })
    }
   
    return (
        <div>
           <h3>Employee Details</h3>
           <table>
            <tr>
                <th>Emp ID</th>
                <th>Name</th>
                <th>Age</th>
                <th>Salary</th>
                <th>Designation</th>
                <th></th>
                <th></th>
            </tr>
           {  
                 
               employees.map((emp)=>{
                return (
                  <tr>
                      <td>{emp.id}</td>
                      <td>{emp.name}</td>
                      <td>{emp.age}</td>
                      <td>{emp.salary}</td>
                      <td>{emp.designation}</td>
                      <td><button>Update</button></td>
                      <td><button onClick={(e) => {deleteEmployee(e,emp.id)}}>Delete</button></td>
                  </tr>
 
                )
               })
           }
           </table>
        </div>
     )
}
 
export default GetEmployees;