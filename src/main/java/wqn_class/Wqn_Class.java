package wqn_class;

import lombok.Data;

@Data
public class Wqn_Class {
    private String name;
    public String name01;


    private void test01(){
        System.out.println("private method in Wqn_class!");
    }

    public void test02(){
        test01();
        System.out.println("public method in Wqn_class!");

    }

}
