package com.syntax.class16;

public class SyntaxEmployee {

    int empID;
    /*
    whenever we are sure that two objects of a class can have different values for a variable or if we have
    to share that variable between two or more methods of that class we should use instance variables
     */
    int salary;
    String c="Sumair";
    void ceo(){
        System.out.println(c);
    }

    public static void main(String[] args) {
        SyntaxEmployee syn1=new SyntaxEmployee();
        syn1.empID=1450;
        syn1.salary=95000;
        System.out.println("Syntax Employee ID: "+syn1.empID);
        System.out.println("Syntax Salary: "+syn1.salary);
        syn1.ceo();

        SyntaxEmployee syn2=new SyntaxEmployee();
        syn2.empID=1451;
        syn2.salary=100000;
        System.out.println("Syntax Employee ID: "+syn2.empID);
        System.out.println("Syntax Salary: "+syn2.salary);
        syn2.ceo();

    }
}
