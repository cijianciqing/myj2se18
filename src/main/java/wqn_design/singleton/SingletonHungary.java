package wqn_design.singleton;

class SingletonHungary {
    private static SingletonHungary singletonHungary = new SingletonHungary();
    //将构造器设置为private禁止通过new进行实例化
    private SingletonHungary() {

    }
    public static SingletonHungary getInstance() {
        return singletonHungary;
    }
}
