package cjDataStructure.calender;

import java.util.Calendar;

public class CalenderTest {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(2000,Calendar.JANUARY,1,0,0,0);//设置2000-1-1 0:0:0
        System.out.println(calendar);
        System.out.println(calendar.getTime());
    }
}
