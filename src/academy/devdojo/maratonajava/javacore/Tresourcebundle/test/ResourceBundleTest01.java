package academy.devdojo.maratonajava.javacore.Tresourcebundle.test;

import java.util.Locale;
import java.util.ResourceBundle;

public class ResourceBundleTest01 {
    public static void main(String[] args) {
        System.out.println(Locale.getDefault());
        ResourceBundle bundle = ResourceBundle.getBundle("mensagem", new Locale("en", "US"));
        String hello = bundle.getString("hello");
        System.out.println(hello);
        System.out.println(bundle.getString("good.morning"));

        bundle = ResourceBundle.getBundle("mensagem", new Locale("pt", "BR"));
        hello = bundle.getString("hello");
        System.out.println(hello);
        System.out.println(bundle.getString("good.morning"));
        // Locale("fr", "CA");
        // messages_fr_CA.properties
        // messages_fr.properties
        // messages_pt_BR.properties
        // messages_pt.properties
        // messages.properties
    }
}
