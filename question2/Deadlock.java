package question2;

import java.util.concurrent.locks.ReentrantLock;

public class Deadlock {
    private static ReentrantLock lock1 = new ReentrantLock();
    private static ReentrantLock lock2 = new ReentrantLock();
    public static <ReentrantLock> void main(String[] args)  throws InterruptedException {
        final String name = "tarundeep";
        final String name1 = "tarundeep Singh";

        Thread t1 = new Thread() {
            @Override
            public void run() {
                if(lock1.tryLock()){
                    lock1.lock();
                    System.out.println("name is locked");
                    
                    try {
                   //     re.lock();
                        Thread.sleep(1000);
                    } catch (Exception e) {}
                    if(lock2.tryLock()){
                        System.out.println("name1 is locked");
                    }
                    lock1.unlock();
                    lock2.unlock();
                }
            }
        };
        Thread t2= new Thread() {
            @Override
            public void run() {

                if(lock1.tryLock()) {
                    lock1.lock();
                    System.out.println("name3 is locked");
                    try {
                        Thread.sleep(1000);
                    } catch (Exception e) {
                    }
                    ;
                    if(lock2.tryLock()) {
                        System.out.println("name4 is locked");
                    }
                    lock1.unlock();
                    lock2.unlock();
                }
            }
        };
        t1.start();
        t2.start();
    }
}
