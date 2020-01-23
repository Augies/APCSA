package net.cox.augies.school.apcsa.spring.six;

public class Vehicle {
    String type;
    String safetyRating; //A B C or D
    boolean factoryWarranty;
    double price;

    //Specific Implementation of bill of Sale done in Child Class
    //public void createBillOfSale(String buyerName){}
    //@param String buyerName - the person purchasing the vehicle
    //Method simply prints the purchaser of vehicle and the amount paid
    //Then lists vehicle type, safety rating, and whether it has factory warranty
    String billOfSale = "";

    Vehicle(String t, String s, boolean f, double p) {
        type = t;
        safetyRating = s;
        factoryWarranty = f;
        price = p;
    }

    public void createBillOfSale(String buyerName){
        System.out.print(buyerName + " has purchased a " + type + " for " + price + " dollars ");
        if(factoryWarranty){
            System.out.println("with a factory warranty.");
        } else{
            System.out.println("without a factory warranty.");
        }
    }
}