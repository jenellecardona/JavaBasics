package com.syntax.class24;

public abstract class Phone {

    abstract void displayPictures();
    abstract void unlock();
    void sendText(){
        System.out.println("use the messaging app to send message");
    }

}
class Iphone extends Phone{
    @Override
    void displayPictures() {
        System.out.println("use the Photos app to display the pictures");
    }

    @Override
    void unlock() {
        System.out.println("use FaceID to unlock the phone");
    }
}
class Samsung extends Phone{

    @Override
    void displayPictures() {
        System.out.println("use the gallery app to display the pictures");
    }

    @Override
    void unlock() {
        System.out.println("use fingerprint sensor or faceID to unlock phone");
    }
}