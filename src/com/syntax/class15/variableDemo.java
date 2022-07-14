package com.syntax.class15;

public class variableDemo {

    String breed;//instance
   static int num=10;//static
    //(whenever you want to share some info in more than one method of a class use instance variable)
    void method1(){
        System.out.println(num);//local variable
    }
    void method2(){
        System.out.println(num);//local variable
    }
     static void printName(){
        String name="Local";
         System.out.println(name);
    }

    public static void main(String[] args) {
        variableDemo v=new variableDemo();
        v.printName();
        System.out.println(variableDemo.num);//static
        variableDemo.printName();//static

    }

}
