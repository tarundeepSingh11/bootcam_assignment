package com.RestApi1.RESTAPI1.Employee;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestBody;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

@Component
public class EmployeeDAOService {
     private static List<Employee> employeeList=new ArrayList<>();
     private static int count=0;
    static{
        employeeList.add(new Employee(++count,"Tarun", LocalDate.now().minusYears(30)));
        employeeList.add(new Employee(++count,"Karan", LocalDate.now().minusYears(32)));
        employeeList.add(new Employee(++count,"Jai", LocalDate.now().minusYears(35)));
    }
    public List<Employee> findAll(){
        return employeeList;
    }
    public Employee findOne(int id){
        Predicate<? super Employee> predicate=employeeList->employeeList.getId().equals(id);
        return employeeList.stream().filter(predicate).findFirst().orElse(null);
    }
    public void deleteOne(int id){
        Predicate<? super Employee> predicate=employeeList->employeeList.getId().equals(id);
        employeeList.removeIf(predicate);
       // return employeeList.stream().filter(predicate).findFirst().orElse(null);
    }
    public Employee save(Employee employee){
        employee.setId(++count);
        employeeList.add(employee);
        return employee;
    }
    public void update(Employee employee){
        Employee ans=null;
        for(Employee e:employeeList){
            if(e.getId()==employee.getId()){
                e.setAge(employee.getAge());
                e.setName(employee.getName());
                break;
            }
        }
    }


}
