package net.cox.augies.school.apcsa.spring.six.shapes;

public class Diamond extends Shape {
    public Diamond(int size, char symbol){
        super(size,symbol);
        draw();
    }

    public void draw(){
        for(int i = getSize()*-1; i < getSize()+1; i++){
            for(int j = getSize()*-1; j < getSize()+1; j++){
                if(Math.abs(i)+Math.abs(j)==getSize()){
                    System.out.print(getSymbol());
                }else{
                    System.out.print(" ");
                }
            }
            System.out.print("\n");
        }
    }
}
