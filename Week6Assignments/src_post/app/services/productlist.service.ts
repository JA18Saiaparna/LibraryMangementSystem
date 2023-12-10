import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Product } from '../model/product';

@Injectable({
  providedIn: 'root'
})
export class ProductlistService {

    baseUrl:string = 'http://localhost:3000/';

  constructor(private http:HttpClient) { }

  addProduct(data:Product){
    const headers={'content-type':'application/json'}
    const body=JSON.stringify(data);
    console.log(data)

    this.http.post<Product>(this.baseUrl+"products",body,{ headers }).subscribe(

        (prod1:Product) => {console.log('product added to json '+data)}

   );

  }


  getAllProducts():Observable<Product[]>{

   return   this.http.get<Product[]>(this.baseUrl+"products");

  }


}
