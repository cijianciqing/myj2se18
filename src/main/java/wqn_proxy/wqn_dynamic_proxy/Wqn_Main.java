package wqn_proxy.wqn_dynamic_proxy;



public class Wqn_Main {
    public static void main(String[] args) {
        //创建被代理对象
        CloseFactoryImpl closeFactoryImpl = new CloseFactoryImpl();
        //创建proxy对象,强转为接口类
        CloseFactory proxyInstance = (CloseFactory)DynamicProxyCloseFactoryImpl.getProxyInstance(closeFactoryImpl);
        //proxy对象执行
        proxyInstance.produceCloth();
    }
}
