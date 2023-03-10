package question9;

import java.util.Arrays;
import java.util.List;

public class question9 {
    public static void main(String[] args) {
        List<Integer> li= Arrays.asList(1,2,3,4,5,6,7,8);
        System.out.println(li);
        List<Integer> li2=List.copyOf(li);
       //now if we modify the list it will show error
        li.add(5);
    }
}
