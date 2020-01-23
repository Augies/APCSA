package net.cox.augies.school.apcsa.spring.six;

public class Pig extends Animal {
    public Pig(String s) {
        super(s);
    }

    public void storyLineOne(){
        System.out.println("I'm magic!!!");
        System.out.println("My name is " + this.name);
    }
}
