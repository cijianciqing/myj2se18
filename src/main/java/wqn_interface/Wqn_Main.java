package wqn_interface;


import java.util.ArrayList;
import java.util.List;

public class Wqn_Main {


    public static void main(String[] args) {
        Wqn_Interface wqn_action = x-> System.out.println("just test02");
        wqn_action.wqn_action_method01("a");
        wqn_action.wqn_action_method();
        Wqn_Interface.wqn_action_method02("b");

    }
}
