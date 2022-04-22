package interview.recursionAnditeration;

public class Recursion {
    /*
    * 递归算法
    * */
    public static int step(int n) {
        if (n == 1 || n == 2) {
            return n;
        }
        return step(n - 1) + step(n - 2);
    }

    /*
    * 循环迭代
    * */
    public static int step2(int n) {
        if (n == 1 || n == 2) {
            return n;
        }
        int step1=1, step2=2, stepAll=3;
        for(int s=4;s<=n;s++){
            step1 = step2;
            step2 = stepAll;
            stepAll = step1 + step2;

        }
        return stepAll;
    }

    public static void main(String[] args) {

        int n=40;
        long start1 = System.currentTimeMillis();
        int step = step(n);
        long end1 = System.currentTimeMillis();

        long start2 = System.currentTimeMillis();
        int step2 = step2(n);
        long end2 = System.currentTimeMillis();

        System.out.println("step1-->"+step);
        System.out.println("step2-->"+step2);

        /*
        * step(40)-249-165580141 ms
        *step2(40)--
        * */
        System.out.println("step1 time-->"+(end1 - start1));
        System.out.println("step1 time-->"+(end2 - start2));
    }


}