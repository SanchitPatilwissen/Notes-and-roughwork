import { CommonModule } from '@angular/common';
import { Component } from '@angular/core';
import { FormControl, FormGroup, FormsModule, ReactiveFormsModule, Validators } from '@angular/forms';

@Component({
  selector: 'app-reactive-forms',
  imports: [CommonModule, FormsModule, ReactiveFormsModule],
  templateUrl: './reactive-forms.component.html',
  styleUrl: './reactive-forms.component.css'
})
export class ReactiveFormsComponent {
  employeeForm:any;

  ngOnInit(){
    this.employeeForm = new FormGroup({
      user: new FormControl("Guest",this.userValidator),
      age: new FormControl("", Validators.compose([
        Validators.min(21),
        Validators.max(60),
        Validators.required
      ])),
      salary: new FormControl(21000),
      designation: new FormControl("Contract")
    })
  }

  userValidator(control:any):any{
    if(control.value.length<5){
      return {user:true};
    }
  }

  abc(obj:any):void{
    console.log(obj);
  }
}
