package question2;

import java.util.Comparator;

public class sortBySalary implements Comparator<Employee> {
    public int compare(Employee a,Employee b){
      //  return (int)(a.salary-b.salary);
        if(a.salary==b.salary) return 0;
        else if(a.salary>b.salary) return 1;
        else return -1;
    }
}
