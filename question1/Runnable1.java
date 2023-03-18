package question1;
class RunnableTask implements Runnable{
    private String name2;

    public RunnableTask(String name2){
      this.name2=name2;

  }
    @Override
    public void run() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("hello"+name2);
    }
}
public class Runnable1 {
    public static void main(String[] args) {
        RunnableTask obj=new RunnableTask("Tarundeep");
        Thread obj2=new Thread(obj);
        obj2.start();
        }
    }

