package thread_and_lock.callable;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class CJThreadTest05 {
    public static class CJCallable implements Callable{

        @Override
        public Object call() throws Exception {
            System.out.println(Thread.currentThread().getName()+"  call() start");
            return "resultOfCallable";
        }
    }

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        CJCallable cjCallable = new CJCallable();
        FutureTask futureTask = new FutureTask(cjCallable);

        new Thread(futureTask).start();

//        Object o = futureTask.get();
//        System.out.println(Thread.currentThread().getName()+"  main() start "+o);
    }
}
