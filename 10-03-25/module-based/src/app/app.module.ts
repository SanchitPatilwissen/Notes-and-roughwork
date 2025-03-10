import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { MyComponentComponent } from './my-component/my-component.component';
import { MyPipePipe } from './my-pipe.pipe';
import { MyCustomDirectiveDirective } from './my-custom-directive.directive';
import { MyServeService } from './my-serve.service';
import { ParentComponent } from './parent/parent.component';

@NgModule({
  declarations: [
    AppComponent,
    MyComponentComponent,
    MyPipePipe,
    MyCustomDirectiveDirective,
    ParentComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule
  ],
  providers: [MyServeService],
  bootstrap: [AppComponent, ParentComponent]
})
export class AppModule { }
