package wqn_class.wqn_inherit;

import lombok.Data;

@Data
public class Class01InClass_inherit02 extends Class01InClass_inherit{



    @Override
    protected  void method02(String name){
        System.out.println("this is method02 in childClass");
    };
}
