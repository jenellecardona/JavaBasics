package com.syntax.class26;

import java.util.ArrayList;

public class ArrayListDemo1 {
    public static void main(String[] args) {
        String name="Aladin";
        String name2="Reza";
        String name3="Ahmed";

        /*
        int size=10;
        String[] arr=new[size];
         */
        String[] names={"Aladin","Reza","Ahmed"};
        names=new String[4];
        names[0]="Aladin";
        names[1]="Reza";
        names[2]="Ahmed";
        names[3]="Zameer";
        System.out.println(names.length);

        ArrayList<String> arr=new ArrayList<>();
        arr.add("Aladin");
        arr.add("Reza");

        arr.add("Zameer");
        System.out.println( arr.size());

        ArrayList<Integer> numbers=new ArrayList<>();
        for(int i=1; i<10;i+=2){
            numbers.add(i);
        }
        System.out.println(numbers);
    }
}




