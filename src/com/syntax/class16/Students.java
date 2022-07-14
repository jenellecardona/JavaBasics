package com.syntax.class16;

public class Students {
String name;
int id;
static int numberOfStudents;

    public static void main(String[] args) {
        Students st=new Students();
        st.name="Arif";
        st.id=1738;
        numberOfStudents=1;// if we are inside the same class we can access static variables inside static methods
        //by just writing the name of that variable we don't need an object
        System.out.println(st.name);
        System.out.println(st.id);
        System.out.println(st.numberOfStudents);

        Students st1=new Students();
        st.name="Arif";
        st.id=1739;
        numberOfStudents=2;
        System.out.println(st.name);
        System.out.println(st.id);
        System.out.println(st.numberOfStudents);

        Students st2=new Students();
        st.name="Arif";
        st.id=1738;
        numberOfStudents++;
        System.out.println(st.name);
        System.out.println(st.id);
        System.out.println(st.numberOfStudents);

}

}
