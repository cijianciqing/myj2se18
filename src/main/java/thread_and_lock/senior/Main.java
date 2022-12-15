package thread_and_lock.senior;

import sun.util.resources.cldr.kea.TimeZoneNames_kea;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.function.BiConsumer;
import java.util.function.Function;

public class Main {
//    public static void main(String[] args) {
//        Thread t1 = new Thread(new TicketWindow(),"TicketWindow1");
//        Thread t2 = new Thread(new TicketWindow(),"TicketWindow2");
//        t1.start();
//        t2.start();
//    }

    public static void main(String[] args) {
        TicketWindow ticketWindow = new TicketWindow();
        ExecutorService executorService = Executors.newFixedThreadPool(5);
        for (int i = 0; i < 3; i++) {//3个窗口卖票
            CompletableFuture.runAsync(ticketWindow, executorService).exceptionally(new Function<Throwable, Void>() {
                @Override
                public Void apply(Throwable throwable) {
                    System.out.println("异常：" + throwable.getMessage());
                    return null;
                }
            });
        }

        executorService.shutdown();
    }
}
