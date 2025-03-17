import React, { useState } from 'react';
import axios from 'axios';

function AddEmployees() {
    const [employee, setEmployee] = useState({"id" : "", "name" : "", "age" : "", "salary" : "", "designation" : ""});

    const assignData = (e) => {
        setEmployee({...employee, [e.target.name] : e.target.value});
    }

    const insertEmployee = (e) => {
        e.preventDefault();
        console.log(employee);
        axios.post("http://localhost:4000/employees", employee).then(
            (response) => {
                console.log("Successfully Inserted");
            }
        );
    }

    const updateEmployee = (e) => {
        e.preventDefault();
        console.log(employee);
        axios.put("http://localhost:4000/employees", employee).then(
            (response) => {
                console.log("Successfully Inserted");
            }
        );
    }

    return (
        <div>
            <h2>Please enter Employee details</h2><br></br>
            <input type="text" value={employee.id} placeholder="Enter Employee ID" name="id" onChange={assignData}></input><br></br>
            <input type="text" value={employee.name} placeholder="Enter Employee Name" name="name" onChange={assignData}></input><br></br>
            <input type="text" value={employee.age} placeholder="Enter Employee Age" name="age" onChange={assignData}></input><br></br>
            <input type="text" value={employee.salary} placeholder="Enter Employee Salary" name="salary" onChange={assignData}></input><br></br>
            <input type="text" value={employee.designation} placeholder="Enter Employee Designation" name="designation" onChange={assignData}></input><br></br><br></br>
            <button onClick={insertEmployee} >SUBMIT</button>
        </div>
    );
}

export default AddEmployees;