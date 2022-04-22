package wqn_class.groundfloor;

public class Class_GroundFloor_Test {
    public static void main(String[] args) {
        try {
            Object cjClass01 = Class.forName("wqn_class.groundfloor.CJClass01").newInstance();
            CJClass01 cjClass02 = CJClass01.class.newInstance();
//            cjClass01.getClass()
//            cjClass01.test();
            if(cjClass01 instanceof CJClass01){
                ((CJClass01) cjClass01).test();
            }
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        }
    }
