package question2;
interface defaultUse{
    default void display(){
        System.out.println("it is in default interface");
    }
}
public class question2 implements defaultUse{
    public static void main(String[] args) {


        question2 q = new question2();
        q.display();
    }
}
