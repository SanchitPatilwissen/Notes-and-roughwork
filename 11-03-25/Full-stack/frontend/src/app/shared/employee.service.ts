import { Injectable } from '@angular/core';
import { Employee } from './employee.model';
import { HttpClient, HttpClientModule } from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class EmployeeService {

  selectedEmployee : Employee = new Employee;
  employees : Employee[] | undefined;

  constructor(private http : HttpClient) { }

  postEmployee(emp: Employee){
    return this.http.post("http://localhost:8090/employees", emp);
  }

  getAllEmployees(){
    return this.http.get("http://localhost:8090/employees");
  }

  putEmployee(emp: Employee){
    return this.http.put("http://localhost:8090/employees", emp);
  }

  deleteEmployee(id: number){
    return this.http.delete("http://localhost:8090/employees/"+id);
  }
}
