package com.syntax.homework;

public class CalcAreaTask1 {
    /*
Create 1 class in which create a methods that will calculate the area (volume in case of box) of
Rectangle
Square
Box
 */

    void area(double length, double width){
        System.out.println("Area "+(length*width));
    }

    static void area(double length){
        System.out.println("Area "+(length*length));
    }
    void volume(double len, double wid, double hi){
        System.out.println("Volume of box "+(len*wid*hi));
    }
    public static void main(String[] args) {
        area(10);
    }
}
