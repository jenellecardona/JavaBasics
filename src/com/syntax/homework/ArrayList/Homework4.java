package com.syntax.homework.ArrayList;

import java.util.ArrayList;

public class Homework4 {
    /*
    Create an arrayList of drinks. If any drink has letter “a” or “e” replace it with water.
     */
    public static void main(String[] args) {
        ArrayList<String> drinks=new ArrayList<>();
        drinks.add("Fanta");
        drinks.add("Milk");
        drinks.add("Snapple");
        drinks.add("Dr.Pepper");
        drinks.add("Hi-C");
        for (int i = 0; i < drinks.size(); i++) {
            if(drinks.get(i).contains("a")||drinks.get(i).contains("e")){
                drinks.remove(i);
                drinks.add(i,"water");
            }
        }
        System.out.println(drinks);
    }
}
