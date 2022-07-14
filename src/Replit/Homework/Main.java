package Replit.Homework;

import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        Child c = new Child("Fairfax");
        c.display();
    }
}
class Parent {
    String city;

    Parent(String city) {
        this.city = city;
    }

    public void display() {
        System.out.println("City name " + city);
    }
}
class Child extends Parent {
    Child(String city) {
        super(city);
    }
}