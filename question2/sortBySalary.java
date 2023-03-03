package question2;

import java.util.Comparator;

public class sortBySalary implements Comparator<Employee> {
    public int compare(Employee a,Employee b){
        return (int)(a.salary-b.salary);
    }
}
