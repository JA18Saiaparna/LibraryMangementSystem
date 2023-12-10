import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Product } from '../model/product';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class ProductService {

  constructor(private http:HttpClient) { }

  baseURL:string = 'http://localhost:8182/api/product/';
  getAll():Observable<Product[]>{

    return this.http.get<Product[]>(this.baseURL+"getall");
  }
  insert (body:Product):Observable<Product>
  {
    return this.http.post<Product>(this.baseURL+"add",body)
  }

}

