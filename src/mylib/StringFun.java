package mylib;

import org.apache.commons.lang3.StringUtils;

import java.util.Locale;

public class StringFun {
    public static String newWord;

    public static StringBuffer anarchize(String word)
    {

        StringBuffer newString = new StringBuffer(word);
        for (int i = 0; i < word.length(); i++)
        {
            if(Character.isUpperCase(word.charAt(i)))
            {
                newString.setCharAt(i, Character.toLowerCase(word.charAt(i)));
            }
            else
                newString.setCharAt(i, Character.toUpperCase(word.charAt(i)));
        }
        return newString;
    }

    public static String camelize(String arg) {
        String result[] = arg.split("\\s+");
        String res = "";
        for(int i = 0; i < result.length; i++) {
            result[i] = result[i].toLowerCase();
            if (i != 0) {
                char c = result[i].charAt(0);
                char cUpper = Character.toUpperCase(c);
                result[i] = result[i].replace(c, cUpper);
            }
            res += result[i];
        }
        return res;
    }

    public static String decamelize(String arg)
    {
        String wynik = "";
        for(int i = 0; i < arg.length(); i++)
        {
            if(Character.isUpperCase(arg.charAt(i)))
            {
                wynik += " ";
            }
            wynik += arg.charAt(i);
        }
        return wynik;
    }


    public static boolean isPalindrome(String arg)
    {
        String text = arg;
        text = text.toLowerCase();
        text = text.replace(" ", "");
        StringBuilder reversed = new StringBuilder(text);
        reversed.reverse();

        boolean isValid;
        if(text.equals(reversed.toString())) {
            isValid = true;
        } else {
            isValid = false;
        }
        return isValid;
    }
}
