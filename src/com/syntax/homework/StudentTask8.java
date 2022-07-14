package com.syntax.homework;

public class StudentTask8 {
    /*
    Write a Student class   that have instance variables name and address.
    Create a constructor that will initialize those variables. Print name & address of given
    student using displayInfo method.
     */
    String name;
    String address;

    StudentTask8(String name, String address){
        this.name=name;
        this.address=address;
    }
    void displayInfo(){
        System.out.println(name+" "+address);
    }

    public static void main(String[] args) {
        StudentTask8 student=new StudentTask8("Jenelle","123 Pacific Street");
        student.displayInfo();
    }
}
