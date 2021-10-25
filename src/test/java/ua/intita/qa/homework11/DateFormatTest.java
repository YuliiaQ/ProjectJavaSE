package ua.intita.qa.homework11;

import org.junit.Test;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

public class DateFormatTest {

    @Test
    public void dateFormat() {
        DateFormat dateFormatDe = DateFormat.getDateTimeInstance(DateFormat.FULL, DateFormat.FULL,
                new Locale("de", "DE"));
        DateFormat dateFormatUk = DateFormat.getDateTimeInstance(DateFormat.FULL, DateFormat.MEDIUM,
                new Locale("en", "UK"));
        DateFormat dateFormatFr = DateFormat.getDateTimeInstance(DateFormat.MEDIUM, DateFormat.FULL,
                new Locale("fr", "FR"));
        DateFormat dateFormatIt = DateFormat.getDateTimeInstance(DateFormat.MEDIUM, DateFormat.MEDIUM,
                new Locale("it", "IT"));

        Date date = new Date();
        System.out.println(date);

        final String formatDe = dateFormatDe.format(date);
        System.out.println(formatDe);
        final String formatUk = dateFormatUk.format(date);
        System.out.println(formatUk);
        final String formatFr = dateFormatFr.format(date);
        System.out.println(formatFr);
        final String formatIt = dateFormatIt.format(date);
        System.out.println(formatIt);
    }
}
