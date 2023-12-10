import { Component } from '@angular/core';
import { Employee } from 'src/app/model/employee';
import { EmployeeService } from 'src/app/services/employee.service';

@Component({
  selector: 'app-updateemployee',
  templateUrl: './updateemployee.component.html',
  styleUrls: ['./updateemployee.component.css']
})
export class UpdateemployeeComponent {
  constructor(private service:EmployeeService){}
 


  
  updateFormData(data:Employee){

    console.log('updating data for emp : '+data.ename)

    this.service.update(data).subscribe( emp => {console.log('emp updated '+emp)})

  }
}
