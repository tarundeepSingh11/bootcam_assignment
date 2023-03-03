package question4;

public class Employee {
    String name;
    int age;
    String designation;

    Employee(String name,int age,String designation){
        this.name=name;
        this.age=age;
        this.designation=designation;
    }
    public void getEmp(){
        System.out.println(name+" "+age+" "+designation);
    }


}
