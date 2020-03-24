package wqn_proxy.wqn_dynamic_proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class Wqn_InvocationHandler implements InvocationHandler {

    //被代理类对象,用于调用被代理对象的方法
    private Object object;

    //类似于构造器的作用
    public void bind(Object object) {
        this.object = object;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("invoke() in wqn_invocationHandler start!");
        //调用被代理类的方法
        Object invoke = method.invoke(object, args);
        System.out.println("invoke() in wqn_invocationHandler end!");
        return invoke;
    }
}
