package question12;
sealed class Parent permits Child1 , Child2{
    public void display(){
        System.out.println("This is Parent");
    }
}

non-sealed class Child1 extends Parent{
    public void display(){
       super.display();
    }
}
final class Child2 extends Parent{
    public void display(){
        System.out.println("i am inside");
    }
}

public class question12 {
    public static void main(String[] args) {
        Child1 obj = new Child1();
        obj.display();
        Child2 obj1=new Child2();
        obj1.display();
    }
}
