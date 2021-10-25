package ua.intita.qa.homework11;

import org.junit.Test;

import java.time.Instant;
import java.time.temporal.ChronoField;

public class InstantTest {

    @Test
    public void demoTestInstant(){
        Instant now = Instant.now();
        System.out.println(now);
        Instant instant1 = now.with(ChronoField.NANO_OF_SECOND, 10);
        System.out.println(instant1);

        long seconds = now.getEpochSecond();
        System.out.println(seconds);
        long nano = now.getNano();
        System.out.println(nano);

        Instant fiveSecondsAfterEpoch = Instant.ofEpochSecond(5);

        System.out.println("now.isAfter(fiveSecondsAfterEpoch)? " + now.isAfter(fiveSecondsAfterEpoch));
        System.out.println("now.isBefore(fiveSecondsAfterEpoch)? " + now.isBefore(fiveSecondsAfterEpoch));
        System.out.println("now.equals(fiveSecondsAfterEpoch)? " + now.equals(fiveSecondsAfterEpoch));
    }
}