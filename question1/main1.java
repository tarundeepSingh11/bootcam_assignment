package question1;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

//interface Consumer{
//    void show(int x);
//}
//
//interface supplier{
//    int show();
//}
//interface predicate{
//    boolean show(int x,int y);
//}
public class main1 {
    public static void main(String[] args) {
        Consumer c=(a)-> System.out.println(a);
        c.accept(5);
       Supplier s=()-> {return 1;};
        System.out.println(s.get());
        Predicate<Integer> p=(x)->{return x>0;};
        System.out.println(p.test(1));
        Function<Integer,Integer> f=(x) ->{return x+10;};
        System.out.println(f.apply(5));




//
//        Consumer con=((x)-> System.out.println("this is the value"+" "+x));
//        con.show(5);
//        supplier sp=(()-> {return 1;});
//        int m=sp.show();
//        System.out.println(m);
//        predicate p=(x,y) -> x<y ;
//        System.out.println(p.show(7,8));
    }
}
