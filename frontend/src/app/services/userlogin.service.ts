import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable, of } from 'rxjs';


@Injectable({
  providedIn: 'root'
})
export class UserService {

  constructor(private http: HttpClient) { }
  baseURL: string = 'http://localhost:8181/api/';

  getGeneratedToken(requestBody: any) {
    return this.http.post(this.baseURL + "login/userlogin", requestBody, { responseType: 'text' as 'json' });
  }
  

  authorizationTestForUser(token: any): Observable<boolean> {
    // Simulate successful user login based on a valid token (You'll need to implement actual token validation logic here)
    // For example, if the token exists and is not expired, consider the user authorized
    const userAuthorized = !!token; // For demonstration, considers any non-empty token as authorized

    return of(userAuthorized); // Returning an observable of boolean using 'of' operator
  }
}
