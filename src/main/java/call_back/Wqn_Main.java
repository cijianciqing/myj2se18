package call_back;

public class Wqn_Main {


    public static void main(String[] args) {
        TestClass testInstance = new TestClass();
        Wqn_Action wqn_action = new Wqn_Action();
        //测试类TestClass通过方法testMethod()调用测试类Wqn_interface
        //testMethod会调用Wqn_interface的方法wqn_action_method()
        testInstance.testMethod(wqn_action);
    }
}
