package wqn_class;

import lombok.Data;

@Data
public class Wqn_ChildClass extends Wqn_ClassTemplate {
    private String address;

    public Wqn_ChildClass(String address){

        this.address = address;
    }

    public String getName01(){
        return this.address;
    }

    @Override
    public String getName() {
        return super.getName()+"aa";
    }

    @Override
    public String toString() {
        return "Wqn_ChildClass{" +
                "address='" + address + '\'' +
                "name='" + this.getName() + '\'' +
                "age='" + this.getAge() + '\'' +
                '}';
    }
}
