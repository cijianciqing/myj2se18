package thread_and_lock.pool;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class CJWindows implements Runnable {
    private int ticketNo = 100;
    Object object =  new Object();

    @Override
    public void run() {
//        System.out.println(Thread.currentThread().getName()+" is going");
//        try {
//            Thread.sleep(1000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
        while (ticketNo>0) {
            synchronized (object){//对于共享数据，同一时间只能一人处理，无需多流程
                if (ticketNo>0) {
                    ticketNo--;
                    System.out.println("ticket " + ticketNo + " : " + Thread.currentThread().getName());
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }


    }

}

public  class CJThreadTest05 {
    public static void main(String[] args) {
        CJWindows cjWindows = new CJWindows();

//        Thread thread1 = new Thread(cjWindows,"w1");
//        Thread thread2 = new Thread(cjWindows,"w2");
//        Thread thread3 = new Thread(cjWindows,"w3");
//        thread1.start();
//        thread2.start();
//        thread3.start();

        ExecutorService executorService = Executors.newFixedThreadPool(3);
//        ThreadPoolExecutor service1 = (ThreadPoolExecutor) executorService;
//        service1.setCorePoolSize(3);
//        service1.setMaximumPoolSize(5);
        for(int i=0; i<10;i++){//10个人买票？？？
            executorService.execute(cjWindows);
        }
        executorService.shutdown();
//

    }
}
