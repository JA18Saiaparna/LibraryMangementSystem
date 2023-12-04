import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import {HttpClientModule} from '@angular/common/http';
import {FormsModule} from '@angular/forms'
import { ReactiveFormsModule } from '@angular/forms';
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { SecurityComponent } from './components/security/security.component';
import { HomeComponent } from './components/home/home.component';
import { AboutComponent } from './components/about/about.component';
import { ContactComponent } from './components/contact/contact.component';
import { WelcomeComponent } from './components/welcome/welcome.component';
import { FooterComponent } from './components/footer/footer.component';
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


@NgModule({
  declarations: [
    AppComponent,
    SecurityComponent,
    HomeComponent,
    AboutComponent,
    ContactComponent,
    WelcomeComponent,
    FooterComponent,
    UserloginComponent,
    UserdashboardComponent,
   
    UserregistrationComponent,
        BorrowbooksComponent,
        DisplaybooksComponent,
        ViewuseraccountComponent,
        FineComponent,
        ReturnbookComponent,
        SearchbookComponent,
        AdmindashboardComponent,
       
        ManagebooksComponent,
    
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,
    FormsModule,
    ReactiveFormsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
