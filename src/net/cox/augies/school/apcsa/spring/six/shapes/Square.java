package net.cox.augies.school.apcsa.spring.six.shapes;

public class Square extends Shape{
    public Square(int size, char symbol){
        super(size,symbol);
        draw();
    }

    public void draw(){
        for(int i = 0; i < getSize(); i++){
            for(int j = 0; j < getSize(); j++){
                if(i==0 || j==0 || j==getSize()-1 || i==getSize()-1){
                    System.out.print(getSymbol());
                }else{
                    System.out.print(" ");
                }
            }
            System.out.print("\n");
        }
    }
}
