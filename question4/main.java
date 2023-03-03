package question4;

import java.util.HashMap;

public class main {
    public static void main(String[] args){
        Employee e1=new Employee("tarundeep",22,"trainee");
        Employee e2=new Employee("karan",33,"engineer");
        HashMap<Object,Integer> hm=new HashMap<Object,Integer>();
        hm.put(e1,67000);
        hm.put(e2,767676);

        System.out.println(hm.get(e1));
        System.out.println(hm.get(e2));
       // System.out.println(hm.getValue(67000));
    }
}
