package com.syntax.class15;

public class Task3 {

    void palindrome(String copy) {

        StringBuilder build = new StringBuilder(copy);
        build.reverse();
        String reversedCopy = build.toString();
        if (copy.equals(reversedCopy)) {
            System.out.println("String is palindrome");
        } else {
            System.out.println("String is not palindrome");
        }
    }

    public static void main(String[] args) {
        Task3 P = new Task3();
        P.palindrome("her");
        P.palindrome("Madam");
    }
}
