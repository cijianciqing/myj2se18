package thread_and_lock.communicate;

/*
* 测试wait notify
* */
public class CJThreadTest03 {
    public static class CJWindow implements Runnable {
        int ticketNo = 0;
        Object object = new Object();

        @Override
        public void run() {
            while (true) {
                synchronized (object) {//代码块应该放到whilez内，而不是while外
//                    object.notify();
                    if (ticketNo < 100) {
                        ticketNo++;
                        System.out.println("ticket " + ticketNo + " : " + Thread.currentThread().getName());
//                        try {
//                            object.wait();
//                        } catch (InterruptedException e) {
//                            e.printStackTrace();
//                        }
                    } else {
                        break;
                    }

                }
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
