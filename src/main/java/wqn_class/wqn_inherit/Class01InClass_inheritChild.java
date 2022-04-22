package wqn_class.wqn_inherit;

import lombok.Data;

@Data
public class Class01InClass_inheritChild extends Class01InClass_inherit{



    @Override
    protected  void method02(String name){

        super.method02(name);
        System.out.println("this is method02 in childClass");

    };

//    public static void main(String[] args) {
//        System.out.println("wqn_class.wqn_inherit.Class01InClass_inheritChild.main....");
//    }


}
