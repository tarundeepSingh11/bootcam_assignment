package question1;

import java.util.concurrent.*;

class CallableTask implements Callable<String> {
    private String name;

    public CallableTask(String name) {
        this.name = name;
    }

    @Override
    public String call() throws Exception {
        Thread.sleep(1000);
        return "Hello" + name;
    }
}

public  class Callable1 {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executorService= Executors.newFixedThreadPool(1);
        Future<String> str =executorService.submit(new CallableTask("Tarundeep"));
        System.out.println(str.get());

    }
}
