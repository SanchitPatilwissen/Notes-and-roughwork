import { Component } from '@angular/core';
import { RouterOutlet } from '@angular/router';
import { InterpolationComponent } from './interpolation/interpolation.component';

@Component({
  selector: 'app-root',
  imports: [RouterOutlet, InterpolationComponent],
  templateUrl: './app.component.html',
  styleUrl: './app.component.css'
})
export class AppComponent {
  title = 'data_binding';
}
