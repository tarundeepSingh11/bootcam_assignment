package question2;

import java.util.Arrays;
import java.util.List;

public class question2 {
    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(10,20,30,40,50,60,70,80,90,100);
        //takewhile
        list.stream()
                .takeWhile(e->e<30)     //if false then stop checking
                .forEach(System.out::println);
        //Dropwhile
        list.stream()
                .dropWhile(e->e<30)
                .forEach(System.out::println);
    }
}
