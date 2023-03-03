package question1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class question1 {
    public static void main(String[] args) {
        // System.out.println("Hello world!");
        List<Float> ls=new ArrayList<Float>();
        ls.add(4.5f);
        ls.add(6.7f);
        ls.add(5.9f);
        ls.add(5.4f);
        ls.add(7.8f);
        Iterator it=ls.iterator();
        while(it.hasNext())System.out.println(it.next()); ;
        int size= ls.size();
        float sum=0f;
        float num=0f;
        for(int i=0;i<size;i++){

            num=ls.get(i);
            sum+=num;
        }
        System.out.println("sum of the number is :");
        System.out.println(sum);

    }
}
