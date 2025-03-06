import { CommonModule } from '@angular/common';
import { Component } from '@angular/core';

@Component({
  selector: 'app-inbuilt-pipes',
  imports: [CommonModule],
  templateUrl: './inbuilt-pipes.component.html',
  styleUrl: './inbuilt-pipes.component.css'
})
export class InbuiltPipesComponent {
  str : string = "sanchit";
  amt : number = 12;
}
