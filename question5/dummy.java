package question5;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.*;

class Employee{
    String fullName;
    int salary;
    String city;

    public Employee(String fullName, int salary, String city) {
        this.fullName = fullName;
        this.salary = salary;
        this.city = city;
    }

    public String getFullName() {
        return fullName;
    }

    public int getSalary() {
        return salary;
    }

    public String getCity() {
        return city;
    }
}
public class dummy {
         static List<Employee> creatEmployee(){
        return Arrays.asList(
                new Employee("Tarundeep singh",4500,"delhi"),
                new Employee("Karan singh",9500,"delhi"),
                new Employee("Mahesh Arora",8500,"UP"),
                new Employee("pulkit Arora",4900,"Bihar"),
                new Employee("Jayant Rajput",3000,"delhi"),
                new Employee("Mahesh Singh",6500,"delhi")
        );
    }

    public static void main(String[] args) {

        List<Employee> li=creatEmployee();
      //  System.out.println(li.stream().filter(p->p.salary<5000).filter(p->p.city=="delhi").collect(groupingBy(Employee::getFullName, mapping(Employee::getSalary, toList()))));
        List<Employee> list= li.stream()
                              .filter(p->p.salary<5000)
                              .filter(p->p.city=="delhi")
                            .collect(Collectors.toList());

        //System.out.println(list);
        for(Employee l:list){
            System.out.println(l.getFullName()+" "+l.getCity()+" "+l.getSalary());
        }

    }
}
