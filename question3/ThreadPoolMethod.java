package question3;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

public class ThreadPoolMethod {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
     List<Callable<String>> obj=new ArrayList<>();
     obj.add(new Callable<String>() {
         @Override
         public String call() throws Exception {
             Thread.sleep(1000);
             return "perform task1";
         }
     });
         obj.add(()-> {
             Thread.sleep(1000);
             return "Perform task2";
         });
        obj.add(() -> {
            Thread.sleep(1000);
            return "Perform task 3";
        });
       // ExecutorService executorService = Executors.newSingleThreadExecutor();
        ExecutorService executorService = Executors.newCachedThreadPool();
//        ExecutorService executorService = Executors.newFixedThreadPool(3);

//
            List<Future<String>> futures = executorService.invokeAll(obj);
            for(Future<String> future : futures)
            {
                System.out.println(future.get());
            }


    }
}
