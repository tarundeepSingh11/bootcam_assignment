package question2;


import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class main {
    public static void main(String[] args) {
        ArrayList<Employee> e1=new ArrayList<>();
        Employee emp1=new Employee(22, 5555,"tarun");
        Employee emp2=new Employee(32, 5000,"karan");
        Employee emp3=new Employee(42, 5544,"kirat");
        e1.add(emp1);
        e1.add(emp2);
        e1.add(emp3);
        Collections.sort(e1,new sortbyname());
        System.out.println(e1);
        System.out.println("List sorted by name");
       for (int i=0;i<e1.size();i++){
            System.out.println(e1.get(i).toString());
        }
        System.out.println("list sorted by salary");
        Collections.sort(e1,new sortBySalary());
        for(int i=0;i<e1.size();i++){
            System.out.println(e1.get(i).toString());

        }

    }
}
