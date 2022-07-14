package com.syntax.class18;

public class Cow {
    String breed;
    String color;
    int age;
    double weight;

    Cow(String breed, String color, int age, double weight){
       //when we have same name variables as local and as instance inside a class
        //always local variables are preffered over instance variables by Java in block of code
        breed=breed;
        color=color;
        age=age;
        weight=weight;
    }
    String getCowInfo(){
        return "Breed "+breed+" Color "+color+" Age "+age+" Weight "+weight;
    }
}
