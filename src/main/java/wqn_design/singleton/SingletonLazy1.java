package wqn_design.singleton;

// 单例模式的懒汉实现1--线程不安全
class SingletonLazy1 {
    private static SingletonLazy1 singletonLazy;

    private SingletonLazy1() {

    }

    public static SingletonLazy1 getInstance() {
        if (null == singletonLazy) {
            try {
                // 模拟在创建对象之前做一些准备工作
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            singletonLazy = new SingletonLazy1();
        }
        return singletonLazy;
    }
}
