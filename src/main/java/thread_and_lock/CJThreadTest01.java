package thread_and_lock;

public class CJThreadTest01 {
    public static class CJThread extends Thread{
        @Override
        public void run() {
            for(int i=0; i<100; i=i+2){
                System.out.println(this.getPriority()+" : " +i+" : "+Thread.currentThread().getName());
            }
        }
    }

    public static void main(String[] args) {
        CJThread cjThread = new CJThread();
        CJThread cjThread2 = new CJThread();
        cjThread2.setPriority(Thread.MAX_PRIORITY);
        cjThread.start();
        cjThread2.start();

    }
}
