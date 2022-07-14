package com.syntax.homework.ArrayList;

import java.util.ArrayList;

public class Homework1 {
    /*
    1) Create an ArrayList that will store 5 names into it.
• Find out whether the given ArrayList is empty or not?
• Check whether the specific name is present in an ArrayList or not?
Find the size of your arrayList and print all values from that
     */
    public static void main(String[] args) {
        ArrayList<String> names=new ArrayList<>();
        names.add("Harry");
        names.add("Ron");
        names.add("Hermione");
        names.add("Neville");
        names.add("Luna");
        System.out.println(names.isEmpty());
        System.out.println(names.contains("Neville"));
        System.out.println(names.size());
        for (String name : names) {
            System.out.println(name);

        }

    }
}
