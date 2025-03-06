import { Component } from '@angular/core';
import { SquarePipe } from '../square.pipe';

@Component({
  selector: 'app-custom-pipes',
  imports: [SquarePipe],
  templateUrl: './custom-pipes.component.html',
  styleUrl: './custom-pipes.component.css'
})
export class CustomPipesComponent {
  
}
