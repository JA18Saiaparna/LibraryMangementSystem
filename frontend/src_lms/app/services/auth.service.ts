import { Injectable } from '@angular/core';
import { JwtClientService } from './jwt-client.service';
import { Router } from '@angular/router';
import { Observable } from 'rxjs';
import { HttpClient } from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class AuthService {
  private tokenKey: string = 'jwtToken';
  
  constructor(private jwtService: JwtClientService, private router: Router,private http: HttpClient) {}

 

  login(username: string, password: string): Observable<any> {
    
    return this.http.post<any>(' http://localhost:8181/api/login/userlogin', { username, password });
  }

  logout(): void {
    
    localStorage.removeItem(this.tokenKey);
    console.log("Token is removed");
  }

  isAuthenticated(): boolean {
    
    return !!localStorage.getItem(this.tokenKey);
  }
       

  
 
 
}
