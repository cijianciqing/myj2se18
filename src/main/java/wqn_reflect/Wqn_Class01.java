package wqn_reflect;

import lombok.Data;

@Data
public class Wqn_Class01 {
    private int id;
    private String name;

    public void test01(){
        System.out.println("a");
    }

    public String test02(String arg01){
        return arg01;
    }

    public Integer test02(Integer arg01){
        return arg01+1;
    }
}
