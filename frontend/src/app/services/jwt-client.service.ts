import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Injectable } from '@angular/core';

import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class JwtClientService {

  constructor(private http:HttpClient) { }
  baseURL:string = 'http://localhost:8181/api/';

    getGeneratedToken(requestBody: any){

        return this.http.post(this.baseURL+"login/adminlogin",requestBody,{responseType: 'text' as 'json'});

    }
    registerUser(requestBody:any)
   {
   return this.http.post(this.baseURL+"librarymanagementsystem/member/add",requestBody,{responseType:'text'as 'json'})
    }


    authorizationTest(token:any){

          let tokenString = "Bearer "+token;

         const headers =  new HttpHeaders().set("Authorization",tokenString);


        return this.http.get(this.baseURL+"admin/getalladmin",{headers,responseType:'text' as 'json'});

    }
}
