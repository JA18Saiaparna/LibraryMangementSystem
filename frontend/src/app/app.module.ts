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
import { AppLayoutComponent } from './components/app-layout/app-layout.component';
import { UserregistrationComponent } from './components/userregistration/userregistration.component';


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
    AppLayoutComponent,
    UserregistrationComponent,
    
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
