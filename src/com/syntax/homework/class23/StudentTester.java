package com.syntax.homework.class23;

public class StudentTester {
    public static void main(String[] args) {
        Student[] student={new SyntaxStudent(),new CollegeStudent(),new SchoolStudent()};
        for(Student St:student){
            St.classSchedule("Jennifer","Lawrence");
            St.studentID(15307);
            St.printSchoolStartDate("Billy","Joel","Jefferson HS","August 30th");
        }
//        SyntaxStudent s=new SyntaxStudent();
//        s.classSchedule("Jennifer","Lawrence");
//
//        CollegeStudent c=new CollegeStudent();
//        c.studentID(15307);
//
//        SchoolStudent sch=new SchoolStudent();
//        sch.printSchoolStartDate("Billy","Joel","Jefferson HS","August 30th");
    }
}
