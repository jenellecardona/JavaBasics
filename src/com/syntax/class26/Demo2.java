package com.syntax.class26;

import java.util.ArrayList;

public class Demo2 {
    public static void main(String[] args) {
        ArrayList <Character> arr=new ArrayList<>();
        arr.add('A');//adds the element to the array list
        arr.add('B');
        arr.add('C');
        arr.add('D');
        System.out.println(arr);
        System.out.println(arr.get(2));//gets the element at that index

        for(int i=0; i<arr.size();i++){
            System.out.print(arr.get(i));
        }

    }
}
