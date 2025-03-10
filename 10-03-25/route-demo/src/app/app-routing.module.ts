import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { HomeComponent } from './home/home.component';
import { AboutusComponent } from './aboutus/aboutus.component';
import { ServicesComponent } from './services/services.component';
import { ContactusComponent } from './contactus/contactus.component';
import { LoginComponent } from './login/login.component';
import { WelcomeComponent } from './welcome/welcome.component';
import { WelcomeGuard} from './guards/welcome.guard';

const routes: Routes = [
  {
    path : '',
    component : HomeComponent
  },
  {
    path : 'about',
    component : AboutusComponent
  },
  {
    path : 'services',
    component : ServicesComponent
  },
  {
    path : 'contact',
    component : ContactusComponent
  },
  {
    path : 'netbanking',
    component : LoginComponent
  },
  {
    path : 'login',
    component : LoginComponent
  },
  {
    path : 'welcome',
    component : WelcomeComponent,
    canActivate : [WelcomeGuard],
    data : ['MANAGER']
  }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
