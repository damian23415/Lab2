package com.company;

import mylib.Account;
import mylib.StrongPasswordGenerator;

public class Main {

    public static void main(String[] args) {
//        Account acc = new Account();
//        acc.setName("damian radomski");
//        System.out.println(acc.getName());
//        System.out.printf("%s%n", Account.capitalize("stanisŁaw maruSARz"));
//        String arg = "Мирослав";
//        System.out.println(acc.translit(arg));

        StrongPasswordGenerator passwd = new StrongPasswordGenerator();

        System.out.println(passwd.generate(20, true, true, true, true));
    }
}
