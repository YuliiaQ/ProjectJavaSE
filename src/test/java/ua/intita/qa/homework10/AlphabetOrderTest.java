package ua.intita.qa.homework10;

import org.junit.Test;

import static org.junit.Assert.*;


public class AlphabetOrderTest {

    @Test
    public void alphabetOrderTest(){
        String text = "If you are still willing to set up your environment for Java programming language, then this section guides \n" +
                "you on how to download and set up Java on your machine. Please follow the steps mentioned below to set up the environment.\n" +
                "Java SE is freely available from the link Download Java. So you download a version based on your operating system.\n" +
                "Follow the instructions to download Java and run the exe to install Java on your machine. \n" +
                "Once you have installed Java on your machine, you would need to set environment variables to point to correct \n" +
                "installation directories.";
        AlphabetOrder alphabetOrder = new AlphabetOrder();

        final String[] finalText = alphabetOrder.orderWords(text);
        assertEquals("are", finalText[0]);
    }
}