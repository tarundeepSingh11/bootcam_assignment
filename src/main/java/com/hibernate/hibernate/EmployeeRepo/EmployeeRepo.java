package com.hibernate.hibernate.EmployeeRepo;

import com.hibernate.hibernate.Employee.employee;
import com.hibernate.hibernate.Product.product;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.List;

public interface EmployeeRepo extends CrudRepository<employee,Integer> , PagingAndSortingRepository<employee,Integer> {
    List<employee> findByName(String name);
    List<employee> findByAgeBetween(int age1,int age2);
    List<employee> findByLocationLike(String location);
}
