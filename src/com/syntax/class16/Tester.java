package com.syntax.class16;

import com.syntax.class17.Employee;

import java.util.Scanner;

public class Tester {

    public static void main(String[] args) {
        AccessModifiersDemo1 ac=new AccessModifiersDemo1();

        String str=new String();//we don't see any import because this class is present
        //inside the java.lang package
        //all the classes inside java.lang package are imported by default for you.

        System.out.println(ac.name);
        Employee emp=new Employee();
        Scanner scan = new Scanner(System.in);

    }
}
