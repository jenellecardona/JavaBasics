package com.syntax.class17;

public class TeacherTester {
    public static void main(String[] args) {
        Teacher teacher=new Teacher();
        teacher.name="Zombie";
        teacher.schoolName="Marvard";
        teacher.printInfo();
        //because printInfo is public we can call it in other classes and because its part of the teacher
        //class it can access the private fields which in turn lets us access those fields

    }

}
