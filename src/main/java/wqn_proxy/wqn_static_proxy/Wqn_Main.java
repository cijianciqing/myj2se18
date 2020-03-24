package wqn_proxy.wqn_static_proxy;

public class Wqn_Main {
    public static void main(String[] args) {
        //创建被代理对象
        CloseFactory closeFactoryImpl = new CloseFactoryImpl();
        //创建proxy对象
        ProxyCloseFactoryImpl proxyCloseFactory = new ProxyCloseFactoryImpl(closeFactoryImpl);
        //proxy对象执行
        proxyCloseFactory.produceCloth();

    }
}
