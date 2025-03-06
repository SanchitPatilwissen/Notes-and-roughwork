import { Component, DoCheck, OnChanges, OnDestroy, OnInit, SimpleChanges } from '@angular/core';

@Component({
  selector: 'app-lifecycle',
  imports: [],
  templateUrl: './lifecycle.component.html',
  styleUrl: './lifecycle.component.css'
})
export class LifecycleComponent implements OnInit, OnChanges, DoCheck, OnDestroy{
  constructor(){
    console.log("Constructor called");
  }

  ngOnChanges(changes: SimpleChanges): void {
      console.log("ngOnChanges called");
  }

  ngDoCheck(): void {
      console.log("ngDoCheck called");
  }

  ngOnDestroy(): void {
      console.log("ngDestroy called");
  }

  ngOnInit(): void {
      console.log("nginit called");
  }
}
