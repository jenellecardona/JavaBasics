package com.syntax.homework.ArrayList;

import java.util.ArrayList;

public class Homework2 {
    /*
    2) Create an arraylist of cars and retrieve all the values using 3 different ways.

     */
    public static void main(String[] args) {
        ArrayList<String> cars=new ArrayList<>();
        cars.add("Honda");
        cars.add("Toyota");
        cars.add("Acura");
        cars.add("Lexus");
        System.out.println(cars);
        System.out.println(cars.subList(0,4));
        for (String car : cars) {
            System.out.print(car+" ");
        }



    }
}
