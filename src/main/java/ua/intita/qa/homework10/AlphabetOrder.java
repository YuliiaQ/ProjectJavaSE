package ua.intita.qa.homework10;

import java.util.Arrays;
import java.util.Locale;

public class AlphabetOrder {
    public String[] orderWords(String text) {

        text.toLowerCase();
        String[] lowerCaseText = text.split("\\W+");
        Arrays.sort(lowerCaseText);
        return lowerCaseText;
    }
}
