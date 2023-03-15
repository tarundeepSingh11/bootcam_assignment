package question3;

public class Volatile {
    private volatile Integer number = 10;

    public static void main(String[] args) {
        Volatile obj = new Volatile();
        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 200 ; i++) {
                    try {
                        Thread.sleep(50);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(obj.number);
                }
            }
        }).start();

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        obj.number = 5;
        System.out.println("number changed");
    }
}
