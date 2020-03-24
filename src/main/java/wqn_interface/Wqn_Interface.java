package wqn_interface;

public interface Wqn_Interface {

    int wqn_parm01 = 11;

    default void wqn_action_method(){

        System.out.println("this is default method in wqn_interface");
    };
    void wqn_action_method01(String arg01);

    static void wqn_action_method02(String arg01){
        System.out.println("this is static method in Wqn_interface");
    };


}
