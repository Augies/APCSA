package net.cox.augies.school.apcsa.spring.six.shapes;

import net.cox.augies.utils.java.Choice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static Scanner sc = new Scanner(System.in);
    public static final ArrayList<String> shapes = new ArrayList<>();

    public static void main(String [] args) {
        if(shapes.size()!=5){
            shapes.add("Square");
            shapes.add("Diamond");
            shapes.add("Trapezoid");
            shapes.add("Triangle");
            shapes.add("Line");
        }
        Choice choice = new Choice("What Shape do You want?", shapes);
        switch(choice.response){
            case 0:
                getSquare();
                break;
            case 1:
                getDiamond();
                break;
            case 2:
                getTrapezoid();
                break;
            case 3:
                getTriangle();
                break;
            case 4:
                getLine();
                break;
        }
        main(args);
    }

    public static void getLine(){
        Map<String,String> items = getSizeSymbol();
        new Line(Integer.parseInt(items.get("size")), items.get("symbol").charAt(0));
    }

    public static void getTriangle(){
        Map<String, String> items = getSizeSymbol();
        new Triangle(Integer.parseInt(items.get("size")), items.get("symbol").charAt(0));
    }

    public static void getTrapezoid(){
        Map<String, String> items = getSizeSymbol();
        new Trapezoid(Integer.parseInt(items.get("size")), items.get("symbol").charAt(0));
    }

    public static void getDiamond(){
        Map<String, String> items = getSizeSymbol();
        new Diamond(Integer.parseInt(items.get("size")), items.get("symbol").charAt(0));
    }

    public static Square getSquare(){
        Map<String,String> items = getSizeSymbol();
        return new Square(Integer.parseInt(items.get("size")), items.get("symbol").charAt(0));
    }

    public static HashMap getSizeSymbol(){
        HashMap map = new HashMap<String, String>();
        System.out.println("What Size?");
        int size = Integer.parseInt(sc.nextLine());
        System.out.println("What Symbol?");
        String symbol = sc.nextLine();
        map.put("size",Integer.toString(size));
        map.put("symbol",symbol);
        return map;
    }
}
