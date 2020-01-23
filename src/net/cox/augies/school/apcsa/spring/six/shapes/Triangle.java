package net.cox.augies.school.apcsa.spring.six.shapes;

public class Triangle extends Shape{
    public Triangle(int size, char symbol){
        super(size, symbol);
        draw();
    }

    public void draw(){
        for(int i = 0; i < getSize(); i++){
            for(int j = -1; j < i; j++){
                if(i==0 || j==-1 || i==getSize()-1 || j==i-1){
                    System.out.print(getSymbol());
                }else{
                    System.out.print(" ");
                }
            }
            System.out.print("\n");
        }
    }
}
