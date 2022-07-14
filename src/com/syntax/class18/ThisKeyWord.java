package com.syntax.class18;

public class ThisKeyWord {
    String name="instance";
    void printName(){
        String name="local";
        System.out.println(name);
        System.out.println(this.name);
    }

    public static void main(String[] args) {
        ThisKeyWord t=new ThisKeyWord();
        t.printName();
    }

}
