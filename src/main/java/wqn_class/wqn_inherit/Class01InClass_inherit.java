package wqn_class.wqn_inherit;

import lombok.Data;


public class Class01InClass_inherit {
    private String name;

    public int age;

    public static void main(String[] args) {
        System.out.println("wqn_class.wqn_inherit.Class01InClass_inherit.main....");
    }
   private void method03(){
        System.out.println("wqn_class.wqn_inherit.Class01InClass_inherit.method03..");
//        System.out.println("name :" + name);
//        System.out.println("age :" + age);

    }

    protected  void method02(String name){
        method03();
       System.out.println("this is method02 in parentClass");
    };

    protected  void method01(String name){
        method02(name);
    };

    @Override
    public String toString() {
        return "Class01InClass_inherit{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
