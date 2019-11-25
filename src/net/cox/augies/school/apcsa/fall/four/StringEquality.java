package net.cox.augies.school.apcsa.fall.four;

public class StringEquality{
	static String x = new String("Hello");
	static String y = new String("Hello");
	
	public static void main(String [] args) {
		if(x.equals(y)) {
			System.out.println(x + " is equal to " + y);
		}else {
			System.out.println(x + " NOT EQUAL " + y);
		}
		
		if(x==y) {
			System.out.println(x + " is equal to " + y);
		}else {
			System.out.println(x + " NOT EQUAL " + y);
		}
		
		System.out.println(x);
		System.out.println(y);
		String [] test = new String[10];
		System.out.println(test); //prints address of where it's saved to memory
		
		String test1 = "hello";
		String a = null;
		String b = "";
		String c = " ";
	}
}
