package com.syntax.class27;

import java.util.ArrayList;
import java.util.List;

public class ListDemo {
    public static void main(String[] args) {
        List<String> legends=new ArrayList<>();//we can store the object of a class inside a variable of type parent
        // or interface if that class implements that interface
        legends.add("Hamid");
        legends.add("Karla");
        legends.add("Naveed");
        legends.add("Tara");
        System.out.println(legends.size());
        System.out.println(legends.isEmpty());
        System.out.println(legends.contains("Burham"));
        System.out.println(legends.contains("Hamid"));
        System.out.println(legends);
        legends.remove("Hamid");
        System.out.println(legends);

        List<String> someStudents=new ArrayList<>();
        someStudents.add("Naveed ");
        someStudents.add("Hamid");
        System.out.println(legends.containsAll(someStudents));


    }
}
