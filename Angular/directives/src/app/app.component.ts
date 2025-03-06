import { Component } from '@angular/core';
import { RouterOutlet } from '@angular/router';

@Component({
  selector: 'app-root',
  imports: [RouterOutlet],
  templateUrl: './app.component.html',
  styleUrl: './app.component.css'
})
export class AppComponent {
  title = 'directives';

  brdrColor : boolean = false;
  bgColor : boolean = false;
  color : string = "GREEN";

  toggleBorderColor(){
    this.brdrColor = !this.brdrColor;
  }

  toggleBgColor(){
    this.bgColor = !this.bgColor;
  }

  setColor(clr:string){
     this.color = clr;
  }
}
