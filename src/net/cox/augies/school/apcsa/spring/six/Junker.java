package net.cox.augies.school.apcsa.spring.six;

public class Junker extends Vehicle{
    public Junker(){
        super("Junker", "Worst.", false, Double.MIN_VALUE);
    }

    public static void main(String [] args){
        Junker junker = new Junker();
        junker.createBillOfSale("Augie");
    }
}
