package wqn_proxy.wqn_static_proxy;

/*
* proxy class
* */
public class ProxyCloseFactoryImpl implements CloseFactory {

    private CloseFactory closeFactory;

    public ProxyCloseFactoryImpl(CloseFactory closeFactory) {
        this.closeFactory = closeFactory;
    }

    @Override
    public void produceCloth() {
        System.out.println("proxy produceCloth() start!");
        closeFactory.produceCloth();
        System.out.println("proxy produceCloth() end!");

    }
}
