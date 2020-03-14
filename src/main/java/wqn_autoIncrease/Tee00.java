package wqn_autoIncrease;

import org.junit.Test;

public class Tee00 {
    public static void main(String[] args) {
        int x1=2 ,x2=2;
        int y1 = x1++;

        int y2 = ++x2;
        System.out.println(x1);
        System.out.println(y1);
        System.out.println(x2);
        System.out.println(y2);


    }

    @Test
    public  void  test(){
        int x=2,y;
        y=++x*x++;
        System.out.println("x : "+x);
        System.out.println("y : "+y);
    }
    @Test
    public  void  test2(){
        int x = 5;
        System.out.println(x++);
        System.out.println(x);
    }
    @Test
    public  void  test3(){
        int x = 5;
        System.out.println(++x);
        System.out.println(x);
    }
}
