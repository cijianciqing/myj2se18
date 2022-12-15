package thread_and_lock.pool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class TicketList{
    private static int  ticketNo = 100;
    Object object =  new Object();
    public synchronized  int getTicketNo(){
         int currentTickNo = ticketNo;
         ticketNo--;
        return currentTickNo;
    }
}

class CJWindows11 implements Runnable {

    TicketList ticketList = new TicketList();

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()+" is going");
        int ticketNo = ticketList.getTicketNo();
        System.out.println(Thread.currentThread().getName()+" is selling ticket "+ticketNo);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }



}
public class CJThreadTest08 {
    public static void main(String[] args) {
        CJWindows11 cjWindows = new CJWindows11();

        ExecutorService executorService = Executors.newFixedThreadPool(3);

        for(int i=0; i<10;i++){//10个人买票？？？
            executorService.execute(cjWindows);
        }
        executorService.shutdown();
//

    }
}
