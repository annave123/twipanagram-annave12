package com.company;


import java.util.Arrays;
import java.util.Scanner;

public class Main{
    public static boolean anagram(String str1, String str2) {


        char[] FirstWord = str1.toLowerCase().replaceAll("\\W", "").toCharArray();
        char[] SecondWord = str2.toLowerCase().replaceAll("\\W", "").toCharArray();
        Arrays.sort(FirstWord);
        Arrays.sort(SecondWord);
        return Arrays.equals(FirstWord, SecondWord);
    }


    public static void main (String [] args) {
        Scanner why = new Scanner(System.in);
        System.out.println("Enter your first word");
        String h = why.nextLine();
        System.out.println("Enter your second word");
        String j = why.nextLine();

        System.out.println(anagram(h, j));

    }
}

