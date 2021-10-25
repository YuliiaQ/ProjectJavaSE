package ua.intita.qa.homework11;

import org.junit.Test;

import java.util.Locale;
import java.util.ResourceBundle;

public class DemoResourceBundleTest {
    @Test
    public void getBundleProperties(){
        Locale locale = new Locale("en", "UK");
        Locale.setDefault(locale);

        System.out.println(Locale.getDefault());

        ResourceBundle bundle = ResourceBundle.getBundle("text");

        for (String str: bundle.keySet()) {
            System.out.println(bundle.getString(str));
        }

        Locale localeGe = Locale.GERMAN;
        System.out.println(localeGe);
        ResourceBundle bundleGe = ResourceBundle.getBundle("text_de_DE");
        for (String str: bundleGe.keySet()) {
            System.out.println(bundleGe.getString(str));
        }

        Locale localeFr = Locale.FRANCE;
        System.out.println(localeFr.getDisplayLanguage());
        System.out.println(localeFr.getDisplayCountry());

        Locale localeIt = new Locale("it", "IT");
        System.out.println(localeIt.getDisplayLanguage());
        System.out.println(localeIt.getDisplayCountry());
    }

}
