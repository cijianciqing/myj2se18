package thread_and_lock.review20221213;


import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CJThreadPoolReview {

    static class CJRunnable implements Runnable {

        @Override
        public void run() {
            for (int i = 0; i < 3; i++) {
                System.out.println(Thread.currentThread().getName() + " : " + i);
            }
        }
    }

    static class CJRunnable2 implements Runnable {

        @Override
        public void run() {
            for (int i = 0; i < 3; i++) {
                System.out.println(Thread.currentThread().getName() + " : " + i);
            }
        }
    }

    /*
     * ThreadPool使用方式1
     * */
    /*public static void main(String[] args) {
        CJRunnable cjRunnable = new CJRunnable();
        ExecutorService executorService = Executors.newFixedThreadPool(5);
//        executorService.execute(cjRunnable);
        for (int i = 0; i < 3; i++) {
            executorService.execute(cjRunnable);

//            executorService.execute(new Runnable() {
//                @Override
//                public void run() {
//                    System.out.println(Thread.currentThread().getName() +" is running!");
//                }
//            });
        }
    }*/

    static class CJWindows implements Runnable {

        CJTicketList ticketList = new CJTicketList();

        @Override
        public void run() {
            System.out.println(Thread.currentThread().getName() + " is going");
            int ticketNo = ticketList.getTicketNo();
            System.out.println(Thread.currentThread().getName() + " is selling ticket " + ticketNo);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    /*
     * ThreadPool使用方式2
     * */
    public static void main(String[] args) {
        CJWindows cjWindows = new CJWindows();

        ExecutorService executorService = Executors.newFixedThreadPool(3);

        for (int i = 0; i < 10; i++) {//10个人买票？？？
            executorService.execute(cjWindows);
        }
        executorService.shutdown();
//

    }
}


