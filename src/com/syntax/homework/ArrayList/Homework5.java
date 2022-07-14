package com.syntax.homework.ArrayList;

import java.util.ArrayList;

public class Homework5 {
    /*
    Create an arrayList of even numbers from 1 to 500. Remove any number that is divisible by 5 from that arrayList.
     */
    public static void main(String[] args) {
        ArrayList<Integer> evenNum=new ArrayList<>();
        for (int i = 1; i <=500; i++) {
            if(i%5==0) {
                evenNum.add(i);
            }
        }
        System.out.println(evenNum);
    }
}
