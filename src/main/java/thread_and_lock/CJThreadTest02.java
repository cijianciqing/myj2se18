package thread_and_lock;

public class CJThreadTest02 {
    public static class CJThread implements Runnable {
        int ticketNo = 0;
        Object object = new Object();

        @Override
        public void run() {
            while (true) {
                synchronized (object) {//代码块应该放到whilez内，而不是while外
//                System.out.println(this.getPriority()+" : " +i+" : "+Thread.currentThread().getName());
                    if (ticketNo < 100) {
                        ticketNo++;
                        System.out.println("ticket " + ticketNo + " : " + Thread.currentThread().getName());

                      /*  try {
                            Thread.sleep(100);//增加线程安全问题
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }*/

                    } else {
                        break;
                    }

                }
            }

        }
    }

    public static void main(String[] args) {
        CJThread cjThread = new CJThread();
        Thread t1 = new Thread(cjThread);
        t1.setName("Window1");
        Thread t2 = new Thread(cjThread);
        t2.setName("Window2");
        Thread t3 = new Thread(cjThread);
        t3.setName("Window3");
        t1.start();
        t2.start();
        t3.start();

    }
}
