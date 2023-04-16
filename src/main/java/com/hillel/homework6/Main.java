package com.hillel.homework6;

import java.util.Random;

public class Main {
    public static void main(String[] args) {

        System.out.println(findSymbolOccurrence("Java", 'a'));
        System.out.println(findWordPosition("Apple", "le"));
        System.out.println(stringReverse("Hillel"));
        System.out.println(isPalindrome("Anna"));

    }

    public static int findSymbolOccurrence(String str, char symbol) {
        int count = 0;

        char[] newCharArray = str.toCharArray();

        for (char ch : newCharArray) {
            if (ch == symbol) {
                count++;
            }
        }
        return count;
    }

    public static int findWordPosition(String source, String target) {
        int index = source.indexOf(target);
        return index >= 0 ? index : -1;
    }

    public static String stringReverse(String str) {
        StringBuilder stringBuilder = new StringBuilder(str);
        stringBuilder.reverse();
        return stringBuilder.toString();
    }

    public static boolean isPalindrome(String str) {
        str = str.replaceAll(" ", "").toLowerCase();
        return str.equals(new StringBuilder(str).reverse().toString());
    }

}

