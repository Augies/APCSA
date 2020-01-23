package net.cox.augies.school.apcsa.spring.six.shapes;

public class Trapezoid extends Shape {

    public Trapezoid(int size, char symbol){
        super(size,symbol);
        draw();
    }

    public void draw(){
//        for(int i = 0; i < getSize(); i++){
//            for(int j = 0; j < i; j++){
//                System.out.print(" ");
//            }
//            for(int j = 0; j < getSize()*2; j++){
//                if(i==0 || j==0 || i==getSize()-1 || j==getSize()*2-1){
//                    System.out.print(getSymbol());
//                }else{
//                    System.out.print(" ");
//                }
//            }
//            System.out.print("\n");
//        }
        for(int i = 0; i < getSize(); i++){
            for(int j = getSize()-i-1; j >= 0; j--){
                System.out.print(" ");
            }
            if(i==0){
                for(int j = 0; j < getSize(); j++){
                    System.out.print(getSymbol());
                }
            }else if(i==getSize()-1){
                for(int j = 0; j < getSize()*3-2; j++){
                    System.out.print(getSymbol());
                }
            }else{
                System.out.print(getSymbol());
                for(int j = 0; j < getSize() + 2*(i-1); j++){
                    System.out.print(" ");
                }
                System.out.print(getSymbol());
            }
            System.out.print("\n");
        }
    }
}
