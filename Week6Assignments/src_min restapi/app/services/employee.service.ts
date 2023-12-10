import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Employee } from '../model/employee';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class EmployeeService {

  constructor(private http:HttpClient) { }

  baseURL:string="http://localhost:8181/api/employees/"
  getAll()
  {
    this.http.get<Employee[]>(this.baseURL+"getall")
  }
}
