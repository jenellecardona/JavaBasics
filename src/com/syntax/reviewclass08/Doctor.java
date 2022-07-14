package com.syntax.reviewclass08;

public class Doctor {

    String firstName,lastName,specialty;
      int experience;
    double salary;
    static String hospital;

    Doctor(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;

    }

    Doctor(String firstName, String lastName, int experience, String specialty) {
        this(firstName, lastName);
        this.experience = experience;
        this.specialty = specialty;
    }

    void printInfo() {
        System.out.println("Doctor name is " + firstName + " " + lastName + " and specialty is " + specialty);
    }

    void work() {
        System.out.println("Doctor " + lastName + " works at " + hospital);
    }
    void treat(String patientName){
        printInfo();
        System.out.println("Treats patient "+patientName);
    }
    //static method only works with static variables
    static void study(String university){
        //printInfo(); CE can not make a static reference to the non static
        System.out.println("Doctor studied at "+university+" and works at "+hospital);
    }
}
