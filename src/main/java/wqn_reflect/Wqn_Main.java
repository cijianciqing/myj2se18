package wqn_reflect;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class Wqn_Main {
    public static void main(String[] args) throws IllegalAccessException, InstantiationException, NoSuchMethodException, InvocationTargetException {
        Wqn_Class01 wqn_class01 = new Wqn_Class01();
        //获取Wqn_Class01的test02(Integer a)方法
        Method method01 = Wqn_Class01.class.getMethod("test02", Integer.class);
        //获取方法的public修饰符
        System.out.println(Modifier.toString(method01.getModifiers()));
        //获取方法的返回值类型
        System.out.println(method01.getReturnType());
        //调用wqn_class01实例的test02()方法
        Integer invoke = (Integer)method01.invoke(wqn_class01, 22);
        System.out.println(invoke);


    }
}
