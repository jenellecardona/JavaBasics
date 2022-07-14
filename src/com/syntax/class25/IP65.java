package com.syntax.class25;

public interface IP65 {
    //private String make="LG"; interface can only have public fields

    //public static final String make="LG"; the default for methods declared without an access modifier in interface
    // classes is public static final, so you do not need to include this.

    //String make="Samsung";
    void wash();

}
interface FiveG{
    void speed();
        }
interface FastChargeable{
    void charging();
}
class S21Ultra implements FiveG,IP65,FastChargeable{

    @Override
    public void wash() {
        System.out.println("you guys can wash me eazy peazy no issue");
    }

    @Override
    public void charging() {
        System.out.println("I support fast charging now because I have implemented this requirement as well");
    }

    @Override
    public void speed() {
        System.out.println();
    }
}
