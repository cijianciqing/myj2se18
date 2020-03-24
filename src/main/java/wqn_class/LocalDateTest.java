package wqn_class;

import java.time.LocalDate;
import java.util.Date;

public class LocalDateTest {

    public static void main(String[] args) {
        LocalDate localDate = LocalDate.now();
        Date date =  new Date(System.currentTimeMillis());
        System.out.println(localDate);
        System.out.println(date);
    }
}
