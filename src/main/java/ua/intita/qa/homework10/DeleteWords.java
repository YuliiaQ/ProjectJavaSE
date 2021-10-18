package ua.intita.qa.homework10;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class DeleteWords {
    public String deleteWords(String text, int length) {
        String newText = text.replaceAll("\\s[^aoeui][a-z]{2}\\s", " ");
        return newText;
    }
}
