package thread_and_lock.review20221213;

public class CJThreadReview {
    //    1.extends Thread
    static class CJThread extends Thread {
        @Override
        public void run() {
            for (int i = 0; i < 10; i++) {
                System.out.println(Thread.currentThread().getName() + " : " + i);
            }
        }
    }

    public static void main(String[] args) {
        CJThread cjThread1 = new CJThread();
        cjThread1.setName("t1-->");
        CJThread cjThread2 = new CJThread();
        cjThread2.setName("t2");

        cjThread1.start();
        cjThread2.start();
        System.out.println(Thread.currentThread().getName());
    }
}
