package com.my;

public class Anagram {
    public static void main(String[] args) {
        // TODO Auto-generated method stub


        String str = "dacb ef F ghijklmnopqrstuvxyzw";

        String str1  = str.toLowerCase();

        int count = 0;
        for(char ch = 'a'; ch<='z'; ch++) {
            for(int i=0;i<str.length();i++) {
                if(str1.charAt(i) == ch) {
                    count++;
                    break;
                }
            }
        }

        System.out.println(count == 26);
    }

}
