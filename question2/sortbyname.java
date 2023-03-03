package question2;

import java.util.Comparator;

public class sortbyname implements Comparator<Employee> {
    public int compare(Employee a,Employee b){
        return a.name.compareTo(b.name);
    }
}
