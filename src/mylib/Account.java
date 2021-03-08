package mylib;
import org.apache.commons.lang3.StringUtils;

import java.util.Locale;

public class Account {
    private String name;
    private static String ukrAlphabet = "абвгдеєжзиіїйклмнопрстуфхцчшщьюя";
    private static String translitRepl[] = {"a","b","v","g","d","e","je","zh","z","y","i","ji", "j",
            "k","l","m","n","o","p","r","s","t","u","f","h","c",
            "ch","sh","shh","'","ju","ja"};
    public String getName() {
        return name;
    }

    public static String capitalize(String aStr)
    {
        String[] tokens = StringUtils.split(aStr);
        for(int i = 0; i < tokens.length; i++)
            tokens[i] = StringUtils.capitalize(tokens[i]);
        return StringUtils.join(tokens,' ');
    }
    public void setName(String name) {
        this.name = capitalize(name);
    }

    public static String translit(String arg) {
        arg.toLowerCase();
        StringBuilder a = new StringBuilder(arg.length());
        for(int i = 0; i < arg.length(); i++) {
            char c = arg.charAt(i);
            int pos;
            pos = ukrAlphabet.indexOf(c);

            if (pos == -1) {
                a.insert(i, c);
            } else {
                a.insert(i, translitRepl[pos]);
            }
        }
        return a.toString();
    }
}
