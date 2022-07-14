package com.syntax.class16;

public class AccessModifiersDemo1 {
    private String password="pass123";//we will not be able to access outside of class
    protected int ssn=12345678;
    public String name="Karla";//we can access this in other packages

    public static void main(String[] args) {
        AccessModifiersDemo1 ac=new AccessModifiersDemo1();
        System.out.println(ac.password);
        System.out.println(ac.ssn);
        System.out.println(ac.name);

    }
}
