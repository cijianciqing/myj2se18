package wqn_design.singleton;

public class Main {
    public static void main(String[] args) {

        Thread2[] ThreadArr = new Thread2[10];
        for (int i = 0; i < ThreadArr.length; i++) {
            ThreadArr[i] = new Thread2();
            ThreadArr[i].start();
        }
    }

}

// 测试线程
class Thread2 extends Thread {
    @Override
    public void run() {
        System.out.println("-------"+Thread.currentThread().getId()+"-------");
        System.out.println(SingletonLazy2.getInstance().hashCode());
    }
}
