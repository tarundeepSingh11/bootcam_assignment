package question3;

import java.util.Arrays;
import java.util.List;
import  java.util.stream.*;

public class question3 {
    public static void main(String[] args) {
//        List<Integer> list= Arrays.asList(99,77,44,55,33,22,234,556,78,654,234);
        //list.stream().rangeClosed\
//        list.stream()
//                .rangeClosed(0,6)
//                .forEach(System.out::println);
        IntStream.range(1,10).forEach(System.out::println);
        System.out.println("this is closed range");
        IntStream.rangeClosed(1,10).forEach(System.out::println);

    }
}
