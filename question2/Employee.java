package question2;

public class Employee {
    int age;
    double salary;
    String name;
    Employee(int age,double salary,String name){
        this.age=age;
        this.salary=salary;
        this.name=name;
    }
    public void getEmployee(){
        System.out.println(age +" "+ salary +" "+ name);
    }
    public String toString()
    {

        // Returning attributes of Student
        return this.age+ " " + this.salary + " "
                + this.name;
    }

}
