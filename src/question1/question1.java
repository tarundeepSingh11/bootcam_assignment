package question1;

interface animal{
    private void dog(){
        System.out.println("it is a dog");
    }
    default void  horse(){
        System.out.println("it am a horse");
        dog();
    }
}
public class question1 implements animal{
    public static void main(String[] args) {
        question1 q=new question1(){};

        q.horse();
    }


}
