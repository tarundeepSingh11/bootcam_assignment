package com.hibernatePart1.hibernatePart1.Employee;

import jakarta.persistence.*;

@Entity
public class Employees {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="empId")
    private int id;
@Column(name="empSalary")
    private int salary;

@Column(name="empFirstName")
    private String firstName;
@Column(name="empLastName")
private String lastName;


    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "employees{" +
                "id=" + id +
                ", salary=" + salary +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                '}';
    }

    public void setAge(int age) {
        this.age = age;
    }

  @Column(name="empAge")
    private int age;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
