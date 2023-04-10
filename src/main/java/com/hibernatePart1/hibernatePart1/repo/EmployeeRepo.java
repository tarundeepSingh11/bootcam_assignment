package com.hibernatePart1.hibernatePart1.repo;


import com.hibernatePart1.hibernatePart1.Employee.Employees;
import jakarta.persistence.criteria.CriteriaBuilder;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface EmployeeRepo extends CrudRepository<Employees,Integer> {

    @Query(value = "Select emp_first_name from employees",nativeQuery = true)
    List<Object> findAllEmployeeNQ();

    @Modifying
    @Query("Update Employees set salary=:new_s where salary<:avg")
    Integer updateByAvgSalary(@Param("avg") Integer avg,@Param("new_s") int new_s);

    @Query("Select Avg(salary) from Employees")
    Integer findAverageOfSalary();

    @Modifying
    @Query("delete Employees  where salary>:min")
    Integer updateByMinSalary(@Param("min") Integer min);

    @Query("Select Min(salary) from Employees")
    Integer findMinumumOfSalary();


    @Query("Select firstName,lastName from Employees where salary>:avg ORDER BY age ASC, salary DESC")
    List<Object[]> findAllEmployeeWithJPQL(@Param("avg") Integer avg);

//    @Query("Select Avg(salary) from Employees")
//    Integer findAverageOfSalary();

    @Modifying
@Query(value = "Delete from employees where emp_age>:age",nativeQuery = true)
Integer deleteByEmployeeByAge(@Param("age") Integer age);
    @Query("from Employees")
    List<Employees> finaAllByname();



}
