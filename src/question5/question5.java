package question5;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
//import java.util.stream;

public class question5 {
    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(1,2,3,4,5,6,7,8);
        list.stream()
                .filter(i->i>5)
                .findFirst()
                .ifPresentOrElse(System.out::println,()-> System.out.println("inside this"));

        list.stream()
                .filter(i->i>5)
                .findFirst()
                .or(()-> Optional.of(-1)).ifPresentOrElse(System.out::println,()-> System.out.println("inside this"));

        list.stream()
                .filter(i->i>5)
                .findFirst()
                .orElseThrow();

    }
}
