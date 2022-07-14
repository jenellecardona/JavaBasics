package com.syntax.homework.inheritance.class20;

public class circleClass extends shapeClass{


    circleClass(int radius){
        super(radius);
    }

    double calculate(){
        double area=Math.PI*Math.pow(radius,2);
       return area;
    }

    public static void main(String[] args) {
        circleClass circle=new circleClass(50);
        System.out.println(circle.calculate());

    }
}
