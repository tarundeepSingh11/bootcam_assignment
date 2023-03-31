package com.RestApi1.RESTAPI1.Employee;

import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserEmployee {
private EmployeeDAOService service;
public UserEmployee(EmployeeDAOService service){
    this.service=service;
}
@GetMapping("/Employee")
public List<Employee> retrieveAllEmployee(){
    return service.findAll();
    }
    @GetMapping("/Employee/{id}")
    public Employee retrieveAllEmployee(@PathVariable int id){

    Employee employee=service.findOne(id);
    if(employee==null)
        throw new EmployeeNotFoundException("id"+id);
    return employee;
    }
    @DeleteMapping("/Employee/{id}")
    public void DeleteAllEmployee(@PathVariable int id){

        service.deleteOne(id);

    }
    @PostMapping("/Employee")
    public void creatEmployee(@Valid @RequestBody Employee employee){
      service.save(employee);
    }
    @PutMapping("/Employee")
    public void UpadteEmployee(@Valid @RequestBody Employee employee){
         this.service.update(employee);
    }

}
