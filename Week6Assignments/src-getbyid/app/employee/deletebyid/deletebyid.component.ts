import { Component } from '@angular/core';
import { Employee } from '../employee';
import { EmployeeService } from '../employee.service';

@Component({
  selector: 'app-deletebyid',
  templateUrl: './deletebyid.component.html',
  styleUrls: ['./deletebyid.component.css']
})
export class DeletebyidComponent {
  empList:Employee[] =[];
  employee: Employee | undefined;
  constructor(private service:EmployeeService){}

  
   delete(formData: any) {
    const id = formData.employeeId; // Retrieve the employee ID from the form data
    this.service.deleteEmployeeById(id)
    alert("Employee with employee id is deleted");
     


}
}
