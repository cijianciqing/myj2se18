package wqn_class;

import lombok.Data;

@Data
public class Wqn_ClassTemplate {
    private int id;
    private String name;
    private int age;

    public Wqn_ClassTemplate(){

    }

    public Wqn_ClassTemplate(int id, String name,int age){
        this.id=id;
        this.name=name;
        this.age=age;
    }

    public Wqn_ClassTemplate( String name,int age){
        this(1,name,age);
    }

}
