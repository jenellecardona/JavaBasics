package com.syntax.class26;

import java.util.ArrayList;

public class Demo9 {
    public static void main(String[] args) {
        Integer number=10;
        System.out.println(Integer.MAX_VALUE);
        //if a number is present in the form of a string using this method we can convert it to its original type.
        int num=Integer.parseInt("20");
        System.out.println(num);
        System.out.println(Integer.MIN_VALUE);
        int num1=15;
        ArrayList<Integer> numbers=new ArrayList<>();
        numbers.add(num1);//it will automatically convert to Integer (auto boxing)
        System.out.println("numbers = " + numbers);
        int num3=numbers.get(0);//auto unboxing-when we go from primitive to non-primitive
        new Integer(15); //boxing
        //if you want to convert manually you can use .intValue() --(also refered to as "boxing")

    }
}
