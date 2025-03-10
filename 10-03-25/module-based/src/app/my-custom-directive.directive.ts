import { Directive } from '@angular/core';

@Directive({
  selector: '[appMyCustomDirective]',
  standalone: false
})
export class MyCustomDirectiveDirective {

  constructor() { }

}
