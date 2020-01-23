package net.cox.augies.school.apcsa.spring.six.shapes;

public abstract class Shape {
    private int size;
    private char symbol;

    public Shape(int size, char symbol){
        this.size = size;
        this.symbol = symbol;
    }

    public abstract void draw();

    int getSize(){
        return this.size;
    }

    char getSymbol(){
        return this.symbol;
    }
}
