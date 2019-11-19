package net.cox.augies.school.apcsa.fall.one;

/**
 * In-Depth study of variables with casting, data typing, ASCII, char values,
 * and primitive data
 * 
 * @author augies
 */
public class Variables {
	public static void main(String[] args) {
		// what is casting
		int x = 489;
		double y = 4.34;
		// cast y into an integer
		int z = (int) y;
		double num = (double) x;
		System.out.println("x: " + x);
		System.out.println("y: " + y);
		System.out.println("z: " + z);
		System.out.println("num: " + num);

		char let = 'h';
		int mystery = (int) let;
		System.out.println("\nmystery: " + mystery);
		// ASCII has numbers correlate with letters
		mystery += 2;
		char mys2 = (char) mystery;
		System.out.println("mys2: " + mys2);

		int a = 9;
		int b = 0;
		int c = -4;
		b = a;
		b = c;
		c = a;
		a = b;
		c = b;
		System.out.println("a: " + a);
		System.out.println("b: " + b);
		System.out.println("c: " + c);
	}
}