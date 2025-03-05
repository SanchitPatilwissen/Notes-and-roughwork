import { Component } from '@angular/core';

@Component({
  selector: 'app-interpolation',
  imports: [],
  templateUrl: './interpolation.component.html',
  styleUrl: './interpolation.component.css'
})
export class InterpolationComponent { 
  private name:string = "Ganesh";
  private age:number = 33;

  getName():string{
    return this.name;
  }

  getAge():number{
    return this.age;
  }
}
