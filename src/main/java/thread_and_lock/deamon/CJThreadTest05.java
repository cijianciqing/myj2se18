package thread_and_lock.deamon;

public class CJThreadTest05 {
    public static void main(String[] args) {
        CJThreadTest cjThreadTest = new CJThreadTest();
        Thread thread = new Thread(cjThreadTest,"用户线程");
        thread.setDaemon(true);
        thread.start();
        System.out.println("====线程开始======"+Thread.currentThread().getName());
    }
}
class CJThreadTest implements Runnable{

    @Override
    public void run() {
        System.out.println("====线程开始======"+Thread.currentThread().getName());
        while (true){
            System.out.println("I am running");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
//        System.out.println("====线程结束======"+Thread.currentThread().getName());
    }
}