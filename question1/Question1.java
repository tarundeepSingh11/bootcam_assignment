package question1;
class Multi1 extends Thread{
    public void run(){
        for(int i=0;i<5;i++){
            try {
                Thread.sleep(500);
            }
            catch (Exception e){
                System.out.println(e);
            }
            System.out.println(i);
        }
    }
}
class Multi2 implements Runnable{

    @Override
    public void run() {
        for(int i=0;i<10;i++){
            try {
                Thread.sleep(500);
            }
            catch (Exception e){
                System.out.println(e);
            }
            System.out.println(i);
        }
    }

}
public class Question1 {
    public static void main(String[] args) {
        Multi1 m=new Multi1();
        Multi1 mm=new Multi1();
        m.start();
        try {
            m.join();
        }
        catch (Exception e){
            System.out.println(e);
        }
        mm.start();
        Multi2 m1=new Multi2();
        Thread t1=new Thread(m1);
        Multi2 mm1=new Multi2();
        Thread t2=new Thread(mm1);
        t1.start();
        try {
            t1.join();
        }
        catch (Exception e){
            System.out.println(e);
        }
        t1.start();

    }
}
