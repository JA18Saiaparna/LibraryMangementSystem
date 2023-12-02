import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { HomeComponent } from './components/home/home.component';
import { AboutComponent } from './components/about/about.component';
import { ContactComponent } from './components/contact/contact.component';
import { SecurityComponent } from './components/security/security.component';
import { WelcomeComponent } from './components/welcome/welcome.component';
import { UserloginComponent } from './components/userlogin/userlogin.component';
import { UserdashboardComponent } from './components/userdashboard/userdashboard.component';
import { UserregistrationComponent } from './components/userregistration/userregistration.component';

const routes: Routes = [
  {path:'',component:WelcomeComponent},
  {path:'about',component:AboutComponent},
  {path:'contact',component:ContactComponent},
  {path:'login',component:SecurityComponent},
  {path:'userlogin',component:UserloginComponent},
  { path: 'user-dashboard', component:UserdashboardComponent },
  {path:'userregister',component:UserregistrationComponent}


];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
