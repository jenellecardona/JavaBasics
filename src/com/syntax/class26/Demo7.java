package com.syntax.class26;

import java.util.ArrayList;

public class Demo7 {
    public static void main(String[] args) {
        //<>  <==Diamond Operator

        ArrayList<String> subjects=new ArrayList<>();
        subjects.add("SDLC");
        subjects.add("Manual Testing");
        subjects.add("Java");
        subjects.add("Git");
        subjects.add("Selenium");
        subjects.add(1,"Jira");//shifts all the elements so that Jira is not located at index 1

        System.out.println(subjects.indexOf("Java"));//returns the index of Java which is 2
        System.out.println(subjects.size());//tells us the total number of elements in the arraylist
        subjects.remove("Git");
        System.out.println("subjects = " + subjects);//to print out an array or arraylist just "soutv"
        for (String subject : subjects) { //itar(Live template)
            System.out.println("subject = " + subject);
       }
        System.out.println(subjects.contains("Selenium"));
        subjects.get(0);
        System.out.println("subjects = " + subjects.get(0));
        System.out.println("subjects = " + subjects);
        subjects.clear(); //clears all the elements in the arraylist
        System.out.println("subjects = " + subjects);

    } 
}
