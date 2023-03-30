package com.javabytes.springh2demo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.javabytes.springh2demo.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long>{

}
