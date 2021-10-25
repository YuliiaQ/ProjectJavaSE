package ua.intita.qa.homework11;

import org.junit.Test;

import java.time.LocalDate;
import java.util.Locale;

public class LocalDateTest {
        @Test
        public void localDate(){
                LocalDate localDate = LocalDate.now();
                System.out.println(localDate);

                int year = localDate.getYear();
                System.out.println(year);

                int month = localDate.getDayOfMonth();
                System.out.println(month);

                LocalDate localDate1 = localDate.plusMonths(5);
                System.out.println(localDate1);

                LocalDate localDate2 = LocalDate.of(2009,8,8);
                System.out.println(localDate2);

                int res = localDate.compareTo(localDate2);
                System.out.println(res);
        }
}
