package net.cox.augies.school.apcsa.spring.six;

public class Animal {
    String name;
    public Animal(String s){
        this.name = s;
    }

    public void speak(String s){
        System.out.println("My name is " + this.name + " I say " + s);
    }
}
