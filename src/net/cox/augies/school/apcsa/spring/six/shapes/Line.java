package net.cox.augies.school.apcsa.spring.six.shapes;

public class Line extends Shape{
    public Line(int size, char symbol){
        super(size, symbol);
        draw();
    }

    public void draw(){
        for(int i = 0; i < getSize(); i++){
            System.out.print(getSymbol());
        }
        System.out.print("\n");
    }
}
