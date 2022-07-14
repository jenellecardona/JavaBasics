package com.syntax.homework.inheritance.class20;

public class userInfo extends Task1 {
    String address;

    userInfo(String userName, String phoneNum,String address) {
        super(userName, phoneNum);
        this.address=address;
    }
     void userDetails(){
        System.out.println("User Name: "+name+" Phone Number: "+phoneNum+" Address: "+address);
    }

    public static void main(String[] args) {
        userInfo info=new userInfo("KJ Miller","703-404-2520","12110 West Side Dr.");
        info.userDetails();
    }
}
