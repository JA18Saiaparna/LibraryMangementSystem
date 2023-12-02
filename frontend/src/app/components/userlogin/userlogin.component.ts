import { Component } from '@angular/core';
import { Router } from '@angular/router';
import { AuthRequest } from 'src/app/model/AuthRequest';
import { UserService } from 'src/app/services/userlogin.service';

@Component({
  selector: 'app-userlogin',
  templateUrl: './userlogin.component.html',
  styleUrls: ['./userlogin.component.css']
})
export class UserloginComponent {
  response: any;
  token: any;
  authRequest: AuthRequest = new AuthRequest();

  constructor(private userService:UserService, private router: Router) {}

  readFormData(formData: any) {
    this.authRequest.username = formData.form.value.username;
    this.authRequest.password = formData.form.value.password;

    this.getAccessToken(this.authRequest);
  }

  getAccessToken(authRequest: any) {
    let response = this.userService.getGeneratedToken(authRequest);

    response.subscribe((genToken) => {
      this.token = genToken;
      console.log(genToken);
      this.accessApi(this.token);
    });
  }

accessApi(token: any) {
  let response = this.userService. authorizationTestForUser(token);

  response.subscribe((responseData) => {
    this.response = responseData;
    console.log(responseData);
    console.log(token);
    this.navigateToUserDashboard();
  });
}

// Function to navigate to 'user-dashboard' route
navigateToUserDashboard() {
  this.router.navigate(['/user-dashboard']);
}
}
