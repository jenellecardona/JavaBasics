package com.syntax.homework.inheritence;

public class TeacherTask3 {
    /*
    Write a Java program called Teacher.  Identify features and behaviour of that Class. Create 3 subclasses
    MathTeacher, ChemistryTeacher and PianoTeacher that would have it their own features and behaviour.
    Test all 4 classes
     */
    String teacherName;
    int yearsExperience;
    int grade;

    void teacherBio(){
        System.out.println("Teacher Name: "+teacherName+" Years of Experience: "+yearsExperience+" Teaches Grade: "+grade);
    }

   }
class MathTeacher extends TeacherTask3{
    MathTeacher(String teacherName, int yearsExperience, int grade){
        this.teacherName=teacherName;
        this.yearsExperience=yearsExperience;
        this.grade=grade;
    }
 }

class ChemistryTeacher extends TeacherTask3{
    ChemistryTeacher(String teacherName, int yearsExperience, int grade){
        this.teacherName=teacherName;
        this.yearsExperience=yearsExperience;
        this.grade=grade;
    }
}
class PianoTeacher extends TeacherTask3 {
    PianoTeacher(String teacherName, int yearsExperience, int grade) {
        this.teacherName = teacherName;
        this.yearsExperience = yearsExperience;
        this.grade = grade;
    }


    public static void main(String[] args) {
    MathTeacher m=new MathTeacher("Mr.Roberts",10,8);
    ChemistryTeacher c=new ChemistryTeacher("Ms.Jackson",5,10);
    PianoTeacher p=new PianoTeacher("Ms.Martin",7,6);
    m.teacherBio();
    c.teacherBio();
    p.teacherBio();
    }
}






