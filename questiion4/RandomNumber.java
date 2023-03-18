package questiion4;

import java.util.Random;
import java.util.concurrent.*;

class Random1 implements Callable<Integer>{

    @Override
    public Integer call() throws Exception {
        Random random = new Random();
        Integer result = random.nextInt(10);
        Thread.sleep(3000);
        return result;
    }
}
public class RandomNumber {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executorService= Executors.newFixedThreadPool(1);
        Future<Integer> ans=executorService.submit(new Random1());
        System.out.println(ans.get());
    }
}
