package com.syntax.class21;

public class MethodOverloading {
    static void add(int num1, int num2){
        System.out.println(num1+num2);
    }
    static void addDoubles(double num1, double num2){
        System.out.println(num1+num2);
    }
/*
You can use the same name and use different parameters
 */
    public static void main(String[] args) {
        add(20,20);
        addDoubles(20.5,20.6);
    }
}
