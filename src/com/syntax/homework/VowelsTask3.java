package com.syntax.homework;

public class VowelsTask3 {
    /*
    Create a method that will accept a String as a parameter and return a new String that consist only of vowels.
    Method should be available inside the class only where it was declared and executed by calling it is name.
     */
    private static String printVowels(String v) {
          return v.replaceAll("[^a,e,i,o,u]","");
    }

    public static void main(String[] args) {
        System.out.println(printVowels("Hogwarts"));

    }
}
