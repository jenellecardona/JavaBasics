package com.syntax.homework.class22;

public class CreditCard {
    /*
    Create a class CreditCard and define variable balance and interest. Create an instance method that will calculate
    interest based on the given balance.Create 2 subclasses: Visa and AX. In AX class override method calculate
    interest.Call the method by creating an object of each of the three classes.
     */

    double balance, interest;

    void calcInterest() {
        double totalInterest = (balance * interest) / 100;
        System.out.println(totalInterest);
    }

    public CreditCard(double balance, double interest) {
        this.balance = balance;
        this.interest = interest;
    }
}
    class Visa extends CreditCard {
    Visa(double balance, double interest){
        super(balance,interest);
    }

    }

    class AX extends CreditCard{
    AX(double balance, double interest){
        super(balance,interest);
    }
        @Override
        void calcInterest() {
            double totalInterest = (balance * interest) / 100;
            System.out.println("Your acquired interest is: "+totalInterest);

        }
        public static void main(String[] args) {
        CreditCard c=new CreditCard(250.00,3.5);
        c.calcInterest();

        Visa v=new Visa(490.95,2.25);
        v.calcInterest();

        AX a=new AX(1200.00,4.0);
        a.calcInterest();

    }

}
