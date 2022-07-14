package com.syntax.homework.inheritence;

public class InheritanceTask1A {
    /*
    Write program for multilevel inheritance where class C inherits from class B and Class B inherits from Class A.
     */
    String name;
    int age;
    char gender;
    String classroom;

    public void rosterInfo(){
        System.out.println("Name: "+name+" Age: "+age+" Gender: "+gender+" Classroom: "+classroom);
    }
}

class InheritanceTask1B extends InheritanceTask1A{
    InheritanceTask1B(String name,int age,char gender,String classroom){
        this.name=name;
        this.age=age;
        this.gender=gender;
        this.classroom=classroom;
    }

    void printClassTeacher(String classTeacher){
        System.out.println("The Daycare Teacher for the "+classroom+" is "+classTeacher);
    }

}
class InheritanceTask1C extends InheritanceTask1B {
    InheritanceTask1C(String name, int age, char gender, String classroom) {
        super(name, age, gender, classroom);
    }

    public static void main(String[] args) {
        InheritanceTask1C c=new InheritanceTask1C("Marcos",1,'M',"Toddler Room");
        InheritanceTask1B b=new InheritanceTask1B("Kai",2,'M',"Twaddler Room");
        c.rosterInfo();
        c.printClassTeacher("Ms.Ashley");
        System.out.println();
        b.rosterInfo();
        b.printClassTeacher("Ms.Stephanie");

    }

}
