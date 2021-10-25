package ua.intita.qa.homework11;

import org.junit.Test;

import javax.swing.*;
import java.sql.Time;

public class TimeTest {
    @Test
    public void demoTestTime(){
        Time time = Time.valueOf("10:00:00");
        System.out.println(time);

        Time time1 = new Time(123456789L);

        System.out.println(time1);

        Time time2 = new Time(21,34,51);
        System.out.println(time2);
        time2.setTime(1212121212121212L);
        System.out.println(time2);

    }
}