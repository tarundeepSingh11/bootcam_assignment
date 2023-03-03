package question4;

import java.sql.SQLOutput;
import java.util.HashMap;
import java.util.Map;

public class main {
    public static void main(String[] args){
        Employee e1=new Employee("tarundeep",22,"trainee");
        Employee e2=new Employee("karan",33,"engineer");
        HashMap<Employee,Integer> hm=new HashMap<>();
        hm.put(e1,67000);
        hm.put(e2,767676);

        for(Map.Entry<Employee,Integer> mp:hm.entrySet()){
            System.out.println(mp.getKey()+" "+mp.getValue());
        }
        for(Employee i:hm.keySet()){
            System.out.println(i+" ");
        }
        for(Integer i:hm.values()){
            System.out.println(i);
        }


//        System.out.println(hm.get(e1));
//        System.out.println(hm.get(e2));
       // System.out.println(hm.getValue(67000));
    }
}
