package com.syntax.class16;

public class StaticDemo {

    static int noOfEmployees=10;
    String name;

    static void method1(){
        System.out.println(noOfEmployees);
        //system.out.println(name)- since the variable can store multiple values it can not be used in a static method
    }
    void method2(){
        System.out.println(noOfEmployees);

    }
}
