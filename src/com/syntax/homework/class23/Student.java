package com.syntax.homework.class23;

public class Student {
    String firstName, lastName, schoolName, startDate;
    int studentID;

    void classSchedule(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        System.out.println(firstName + " " + lastName + " class schedule includes Math, Science and History");
    }
    void studentID(int studentID) {
        System.out.println("My student ID number is: " + studentID);
    }

      void printSchoolStartDate(String firstName, String lastName, String schoolName, String startDate) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.schoolName = schoolName;
        this.startDate = startDate;
        System.out.println(firstName + " " + lastName + " goes to school at " + schoolName + " and their start date is " + startDate);
    }
}

class SyntaxStudent extends Student {
    void courseTime() {
        System.out.println("Syntax's course will only last 6 months");
    }
    @Override
    void classSchedule(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        System.out.println(firstName + " " + lastName + " class schedule includes Java and Selenium");
    }

    @Override
    void printSchoolStartDate(String firstName, String lastName, String schoolName, String startDate) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.schoolName = schoolName;
        this.startDate = startDate;
        System.out.println(firstName + " " + lastName + " School Name: " + schoolName + " Course Start Date: " + startDate);
    }
}
    class CollegeStudent extends Student {
        void semester() {
            System.out.println("Summer semester will end in August ");
        }

        @Override
        void classSchedule(String firstName, String lastName) {
            this.firstName = firstName;
            this.lastName = lastName;
            System.out.println(firstName + " " + lastName + " class schedule includes only English and Sociology this semester");
        }

        @Override
        void studentID(int studentID) {
            System.out.println("My student ID number is: "+studentID+" but I am transferring Harvard in the Fall so it will change");
        }
    }

    class SchoolStudent extends Student {
        void winterBreak() {
            System.out.println("Winter break this year will be from December 19 to January 2");
        }

        @Override
        void classSchedule(String firstName, String lastName) {
            this.firstName = firstName;
            this.lastName = lastName;
            System.out.println(firstName + " " + lastName + " class schedule includes Math, Science and English");
        }

        @Override
        void printSchoolStartDate(String firstName, String lastName, String schoolName, String startDate) {
            this.firstName = firstName;
            this.schoolName = schoolName;
            this.startDate = startDate;
            System.out.println(firstName+" "+lastName+" attends " + schoolName + " and they start classes on " + startDate);
        }
    }
