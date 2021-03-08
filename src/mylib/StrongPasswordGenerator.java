package mylib;

import java.util.Random;

public class StrongPasswordGenerator {
    private int dlugosc;
    private String[] maleLiteryTab = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "r", "o", "p", "r", "s", "t", "u", "w", "x", "y", "z"};
    private String[] wielkieLiteryTab = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "R", "S", "T", "U", "W", "X", "Y", "Z"};
    private String[] cyfryTab = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};
    private boolean znakiSpecjalne;
    private String[] dowolneZnakiSpecjalneTab = {"!", "@", "#", "$", "%", "^", "&", "*"};

    public String generate(int dlugosc, boolean maleLitery, boolean wielkieLitery, boolean cyfry, boolean znakiSpecjalne)
    {
        String password = "";
        int licznik = 0;
        Random generator = new Random();
        for (int i = 0; i < dlugosc; i++)
        {
            if(maleLitery == true)
            {
                password += maleLiteryTab[generator.nextInt(maleLiteryTab.length)];
                licznik++;
                if(licznik == dlugosc)
                    break;
            }
            if(wielkieLitery == true)
            {
                password += wielkieLiteryTab[generator.nextInt(wielkieLiteryTab.length)];
                licznik++;
                if(licznik == dlugosc)
                    break;
            }
            if(cyfry == true)
            {
                password += cyfryTab[generator.nextInt(cyfryTab.length)];
                licznik++;
                if(licznik == dlugosc)
                    break;
            }
            if(znakiSpecjalne == true) {
                password += dowolneZnakiSpecjalneTab[generator.nextInt(dowolneZnakiSpecjalneTab.length)];
                licznik++;
                if(licznik == dlugosc)
                    break;
            }
        }
        return password;
    }
}
