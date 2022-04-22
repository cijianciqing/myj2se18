package cjThread.communicate.lock;

import java.util.concurrent.locks.ReentrantLock;

/*
* 测试：不能在lock之间的代码中添加wait--notify
* */
public class CJThreadTest04 {
    public static class CJWindow implements Runnable {
        int ticketNo = 0;
//        Object object = new Object();
        private final ReentrantLock lock = new ReentrantLock();

        @Override
        public void run() {
            while (true) {
                lock.lock();
//                synchronized (object) {//代码块应该放到whilez内，而不是while外
                lock.notify();
                    if (ticketNo < 100) {
                        ticketNo++;
                        System.out.println("ticket " + ticketNo + " : " + Thread.currentThread().getName());
//                        try {
//                            Thread.sleep(100);
//                        } catch (InterruptedException e) {
//                            e.printStackTrace();
//                        }
                        try {
                            lock.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        lock.unlock();
                    } else {
                        lock.unlock();
                        break;
                    }

//                }
            }

        }
    }

    public static void main(String[] args) {
        CJWindow cjThread = new CJWindow();
        Thread t1 = new Thread(cjThread);
        t1.setName("Window1");
        Thread t2 = new Thread(cjThread);
        t2.setName("Window2");
        t1.start();
        t2.start();

    }
}
