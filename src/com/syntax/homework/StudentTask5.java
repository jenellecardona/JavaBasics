package com.syntax.homework;

public class StudentTask5 {
    /*
    Write a java Class Students that have a constructor which takes students name and 3 subject grades.
    Inside your class also have a method to Calculate Average Grade. Test Student class for 5 different
    students with different marks. Your program should print an average mark of each student's name.
NOTE: please use different names for instance and local variables.
     */
    double g1Marks, g2Marks, g3Marks;
    String name;

    StudentTask5(String name, double grade1Marks, double grade2Marks, double grade3Marks){
        g1Marks=grade1Marks;
        g2Marks=grade2Marks;
        g3Marks=grade3Marks;
        this.name=name;//we are using "this" with name because we have same name variable inside constructor
        // parameters as well

    }

    public void calculateAvgGrade(){
        double avgGrade=(g1Marks+g2Marks+g3Marks)/3;
        System.out.println(name+avgGrade);
    }
}
