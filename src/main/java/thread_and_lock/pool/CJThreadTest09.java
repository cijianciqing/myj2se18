package thread_and_lock.pool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;



class CJWindows2 implements Runnable {

    private static int ticketNo = 100;
    private static Object object = new Object();
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()+" is going");
        synchronized (object){
            if(ticketNo>0){
                System.out.println(Thread.currentThread().getName()+" is selling ticket "+ticketNo);
            }
            ticketNo--;
        }

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }



}

public class CJThreadTest09 {
    public static void main(String[] args) {
        CJWindows2 cjWindows = new CJWindows2();

        ExecutorService executorService = Executors.newFixedThreadPool(3);

        for(int i=0; i<10;i++){//10个人买票？？？
            executorService.execute(cjWindows);
        }
        executorService.shutdown();
//

    }
}
