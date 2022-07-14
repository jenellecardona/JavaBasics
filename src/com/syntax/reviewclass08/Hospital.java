package com.syntax.reviewclass08;

public class Hospital {
    public static void main(String[] args) {
        Doctor doc=new Doctor("Jane","Smith");
        doc.printInfo();

        Doctor.hospital="UCSF";
        doc.work();

        //create another doctor
        Doctor d=new Doctor("Jane","Doe",10,"Cardiologist");
        d.printInfo();
        d.work();

        //changing the value of static variable
        System.out.println("Changing the value of the static variable");
        Doctor.hospital="George Washington";
        doc.work();
        d.work();

        //change last name
        System.out.println("Changing the value of the instance variable");
        doc.lastName="Obama";
        doc.printInfo();
        d.printInfo();

        doc.hospital="Mayo Clinic";  //since hospital is static then it will change static variable value
        //compiler is telling you that you are accessing static like an instance variable
        //you should really say Doctor.hospital="Mayo Clinic";

        doc.work(); //Mayo clinic
        d.work(); //Mayo Clinic

        System.out.println();
        d.treat("Samantha");

        //accessing static method
        d.study("GTU");



    }
}
