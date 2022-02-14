package com.company;

public class ArrayUtil {
    public static <T extends Comparable> void jestPalindromem(T[] tab) {
        boolean palindrom = true;
        for (int i = 0; i < tab.length / 2; i++) {
            if (!tab[i].equals(tab[tab.length - 1 - i])) {
                palindrom = false;
                break;
            }
        }
        if (palindrom) {
            System.out.println("Podany argument jest palindromem");
        } else {
            System.out.println("Podany argument nie jest palindromem");
        }
    }
}
