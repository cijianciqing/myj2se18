package wqn_class.wqn_inherit;

public class Main {

    public static void main(String[] args) {
//        Class01InClass_inherit02 class01InClass_inherit = new Class01InClass_inherit02();
//        class01InClass_inherit.method01("abc");
//        System.out.println(Class01InClass_inherit.class.isAssignableFrom(Class01InClass_inherit02.class));
//        System.out.println(Class01InClass_inherit02.class.isAssignableFrom(Class01InClass_inherit02.class));
        Class01InClass_inherit parent = new Class01InClass_inherit();

        Class01InClass_inherit02 child = (Class01InClass_inherit02) parent;

       child.method02("aab");

    }
}
