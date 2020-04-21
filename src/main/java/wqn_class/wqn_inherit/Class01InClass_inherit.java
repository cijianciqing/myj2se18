package wqn_class.wqn_inherit;

import lombok.Data;

@Data
public class Class01InClass_inherit {
    String name;

    protected  void method01(String name){
        method02(name);
    };
    protected  void method02(String name){
        System.out.println("this is method02 in parentClass");
    };
}
