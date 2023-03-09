package question4;

import java.util.Optional;

public class optional {
    public static void main(String[] args) {
        String str="Tarundeep";
        Optional<String> op= Optional.of(str);
        System.out.println(op.get());
        String str2="Tarundeep";
        System.out.println(op.equals(str2));
        System.out.println(op.hashCode());
        System.out.println(op.orElse("not there"));
        op.stream().forEach(System.out::println);


    }
}
