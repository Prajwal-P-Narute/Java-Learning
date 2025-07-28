package com.my;

import java.util.Arrays;
public class AnagramString {
    public static void main(String [] args) {

        System.out.println(anagramString("silent", "listen"));
        System.out.println(anagramString("god", "Dog"));
        System.out.println(anagramString("act", "CAT"));
        System.out.println(anagramString("silent", "li s  te  n"));
        System.out.println(anagramString("joy", "enjoy"));
        System.out.println(anagramString("eLVis", "LiveS"));
        System.out.println(anagramString("shot", "Toss"));

    }

    public static boolean anagramString(String s1, String s2) {

        // ignoring space
        String str1 = s1.replaceAll(" ", "");
        String str2 = s2.replaceAll(" ", "");

        if(str1.length() != str2.length()) {
            return false;
        }
        else {
            // converting to lower case and then char Array
            char[] c1 = str1.toLowerCase().toCharArray();
            char[] c2 = str2.toLowerCase().toCharArray();

            // sorting array
            Arrays.sort(c1);
            Arrays.sort(c2);

            return Arrays.equals(c1, c2);
        }
    }
}
