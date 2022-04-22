package wqn_set;

import java.util.HashSet;
import java.util.Set;

public class MainSet {
    public static void main(String[] args) {
        TestClass class01 = new TestClass();
        class01.setName("abc");
        TestClass class02 = new TestClass();
        class02.setName("abc");
        Set<TestClass> set01  = new HashSet<>();
        set01.add(class01);
        set01.add(class02);

        System.out.println(set01);

    }
}
