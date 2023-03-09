package question3;

import java.util.Arrays;
import java.util.List;
import java.util.stream.*;

public class sumOfFive {
    public static void main(String[] args) {
        // sum of number which are greater then 5
        List<Integer> list= Arrays.asList(5,3,10,66,55,15,3);
        System.out.println(list);
        List<Integer> fivess=list.stream()
                .filter(s->s>5)
                   .collect(Collectors.toList());

        System.out.println(fivess);
        System.out.println(fivess);
        int sum=fivess.stream()
                .reduce(0,(a,b)->a+b);
        System.out.println(sum);
    }
}
