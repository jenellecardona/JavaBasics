package com.syntax.homework.ArrayList;

import java.util.ArrayList;

public class Homework3 {
    /*
    3) Create an arrayList of words. Remove every word that ends with “e”.
     */
    public static void main(String[] args) {
        ArrayList<String> words=new ArrayList<>();
        words.add("Receive");
        words.add("Goods");
        words.add("Produce");
        words.add("Shipment");
        System.out.println(words);
        for (int i = 0; i < words.size(); i++) {
            if(words.get(i).endsWith("e")){
                words.remove(i);
            }
        }
        System.out.println(words);
    }
}
