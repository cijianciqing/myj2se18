package wqn_class;

public class Wqn_main {
    public static void main(String[] args) {
//        Wqn_Class wqn_class = new Wqn_Class();
//        wqn_class.test02();
//        System.out.println(wqn_class.name01);
        String a ="aa";
        Wqn_ClassTemplate wqn_classTemplate;
        Wqn_ClassTemplate wqn_classTemplate01 = new Wqn_ClassTemplate(1,"a1",12);
        Wqn_ChildClass wqn_childClass = new Wqn_ChildClass("b");
        wqn_childClass.setName("aaa");
        System.out.println(wqn_childClass.getClass());


        wqn_classTemplate=wqn_childClass;
        System.out.println(wqn_classTemplate.getClass());


        }
}
