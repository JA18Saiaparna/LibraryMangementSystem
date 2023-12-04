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
import { BorrowbooksComponent } from './components/borrowbooks/borrowbooks.component';
import { DisplaybooksComponent } from './components/displaybooks/displaybooks.component';
import { ViewuseraccountComponent } from './components/viewuseraccount/viewuseraccount.component';
import { FineComponent } from './components/fine/fine.component';
import { ReturnbookComponent } from './components/returnbook/returnbook.component';
import { SearchbookComponent } from './components/searchbook/searchbook.component';
import { AdmindashboardComponent } from './components/admindashboard/admindashboard.component';
import { ManagebooksComponent } from './components/managebooks/managebooks.component';


const routes: Routes = [
  {path:'',component:WelcomeComponent},
  
  {path:'about',component:AboutComponent},
  {path:'contact',component:ContactComponent},
  {path:'login',component:SecurityComponent},
  {path:'userlogin',component:UserloginComponent},
  {path: 'user-dashboard', component:UserdashboardComponent },
  {path:'userregister',component:UserregistrationComponent},
  {path: 'borrowbooks', component: BorrowbooksComponent },
  {path: 'displaybooks', component: DisplaybooksComponent },
  {path: 'viewuseraccount', component: ViewuseraccountComponent },
  {path:'fine',component:FineComponent},
  {path:'returnbook',component:ReturnbookComponent},
  {path:'searchbook',component:SearchbookComponent},
  {path:'admindashboard',component:AdmindashboardComponent},
  {path: 'managebooks', component: ManagebooksComponent },
  {path:'welcome',component:WelcomeComponent},
  {path: 'userdashboard', component:UserdashboardComponent },

];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
