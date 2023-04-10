package com.hibernatePart1.hibernatePart1.inheritance.entity;

import com.hibernatePart1.hibernatePart1.Employee.Employees;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface Paymentrepo extends CrudRepository<Payment,Integer> {

}
