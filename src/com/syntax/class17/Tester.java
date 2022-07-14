package com.syntax.class17;

import com.syntax.class16.Dog;

public class Tester {
    public static void main(String[] args) {
        /*
        If classes exist inside the same package they are imported automatically
         */
        Employee employee = new Employee();
        Dog dog = new Dog();
        employee.name = "Mike";
        //employee.salary=125000;you are unable to access because its private in Employee class
        employee.department = "IT Saver";//since "department" does not have a keyword access modifer it is
        // automatically default and can be accessed only if the class is in the same package
        //employee.printSalary(); because its private we can not access it
        employee.printDepartment();
        employee.printName();
    }
}
