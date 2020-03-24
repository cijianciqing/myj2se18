package wqn_proxy.wqn_dynamic_proxy;

import java.lang.reflect.Proxy;

/*
* proxy class
* 根据被代理类创建proxy class
* 当调用proxy class的method时，自动调用被代理类的method
* */
public class DynamicProxyCloseFactoryImpl {


    //创建proxy class
    public static Object getProxyInstance(Object obj) {

        Wqn_InvocationHandler wqn_invocationHandler = new Wqn_InvocationHandler();

        wqn_invocationHandler.bind(obj);

        return Proxy.newProxyInstance(obj.getClass().getClassLoader(), obj.getClass().getInterfaces(), wqn_invocationHandler);

    }


}
