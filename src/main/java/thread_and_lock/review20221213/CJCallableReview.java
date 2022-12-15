package thread_and_lock.review20221213;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class CJCallableReview {
    static class CJCallable implements Callable<String> {
        @Override
        public String call() throws Exception {
            System.out.println(Thread.currentThread().getName());
            return Thread.currentThread().getName();
        }
    }

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        CJCallable cjCallable = new CJCallable();
        FutureTask<String> futureTask = new FutureTask<>(cjCallable);
        //这个很重要
        Thread thread = new Thread(futureTask);
        thread.start();
        String s = futureTask.get();
        System.out.println(s);
        System.out.println(Thread.currentThread().getName());
    }
}
