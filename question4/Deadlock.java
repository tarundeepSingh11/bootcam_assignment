package question4;

//throws InterruptedException
public class Deadlock {
    public static void main(String[] args)  throws InterruptedException{
        final String name="tarundeep";
        final String name1="tarundeep Singh";
        Thread t1=new Thread(){
            @Override
            public void run() {

                synchronized (name){
                    System.out.println("name is locked");
                    try {
                        Thread.sleep(1000);
                    }
                    catch (Exception e){};
                    synchronized (name1){
                        System.out.println("name1 is locked");
                    }

                }
            }
        };
        Thread t2=new Thread(){
            @Override
            public void run() {

                synchronized (name1){
                    System.out.println("name1 is locked");
                    try {
                        Thread.sleep(1000);
                    }
                    catch (Exception e){};
                    synchronized (name){
                        System.out.println("name is locked");
                    }

                }
            }
        };
        t1.start();
        t2.start();

    }
}
