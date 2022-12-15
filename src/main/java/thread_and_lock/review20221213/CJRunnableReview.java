package thread_and_lock.review20221213;

import java.util.concurrent.ExecutionException;

public class CJRunnableReview {
    static class CJRunnable implements Runnable {

        @Override
        public void run() {
            for (int i = 0; i < 10; i++) {
                System.out.println(Thread.currentThread().getName() + " : " + i);
            }
        }
    }

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        CJRunnable cjRunnable = new CJRunnable();

        Thread thread1 = new Thread(cjRunnable,"t1");
        thread1.start();

        Thread thread2 = new Thread(cjRunnable,"t2");
        thread2.start();

        System.out.println(Thread.currentThread().getName());
    }
}
