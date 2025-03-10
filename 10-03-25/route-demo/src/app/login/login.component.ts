import { Component } from '@angular/core';
import { Router } from '@angular/router';
import { RoleService } from '../services/role.service';

@Component({
  selector: 'app-login',
  standalone: false,
  templateUrl: './login.component.html',
  styleUrl: './login.component.css'
})
export class LoginComponent {
  msg : string = "";

  constructor(private router : Router, private rs : RoleService ){

  }

  abc(event : any){
    event.preventDefault();
    let uname = event.target.elements[0].value;
    let pwd = event.target.elements[1].value;
    let role = event.target.elements[2].value;
    this.rs.role = role;

    console.log(role);

    if(uname === pwd){
      this.router.navigate(['welcome']);
      this.msg = "You are not authorized to access";
    }
    else{
      this.msg = "Sorry ! Invalid Credentials";
      this.router.navigate(['login']);
    }
  }
}
