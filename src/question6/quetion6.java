package question6;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class quetion6 {
    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(1,2,3,4,5,6,7,8);
        List<Integer> li=list.stream()
                             .filter(i->i%2==0)
                             .findFirst()
                             .stream()
                              .collect(Collectors.toList());
        System.out.println(li);
    }
}
