package question2;
interface useStatic{
    static void display(){
        System.out.println("i am inn static ");
    }
}
public class withStatic {
    public static void main(String[] args) {
        useStatic.display();
    }
}
