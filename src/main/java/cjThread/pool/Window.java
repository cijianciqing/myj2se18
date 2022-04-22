package cjThread.pool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * 1、创建线程数量为5的线程池
 * 2、同时运行5个买票窗口
 * 3、总票数为100，每隔一秒钟卖一张票
 * @author Administrator
 *
 */
public class Window {

    static int tickets = 100;
    static String string = "";

    public static void main(String[] args) {
        ExecutorService service = Executors.newFixedThreadPool(5);
        service.execute(new Runnable() {
            @Override
            public void run() {
                while (tickets > 0) {
                    synchronized (string) {
                        try {
                            if (tickets > 0) {
                                System.out.println(Thread.currentThread().getName()
                                        + "卖出了第" + (tickets--) + "张票");
                                Thread.sleep(1000);
                            }

                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    }
                }

            }
        });
        //关闭线程池
        service.shutdown();
    }

}