import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class AppService {


  data=[
     {"pid":101,"pname":"mobile","price":5000},
     {"pid":102,"pname":"watch","price":2000},
     {"pid":103,"pname":"I-pad","price":50000}
  ]
  constructor() { }


getAllData (){
  return this.data;
}
}
