package net.cox.augies.school.apcsa.fall.one;

/**
 * 
 * @author req96090
 * 
 *         Exploration of the math class in java
 */
public class ExtraMath {
	public static void main(String[] args) {
		double x = Math.abs(-5.1);
		System.out.println("Absolute value of -5.1: " + x);
		double a = Math.round(5.1);
		double b = Math.floor(5.1);
		double c = Math.ceil(5.1);
		double d = Math.log10(100);
		double e = Math.cos(Math.PI);
		double f = Math.max(10, 100);
		double g = Math.min(10, 100);
		double h = Math.pow(2, 5);
		double i = Math.random();
		double j = Math.sin(Math.PI);
		System.out.println("round 5.1: " + a);
		System.out.println("floor 5.1: " + b);
		System.out.println("ceil 5.1: " + c);
		System.out.println("log10 100: " + d);
		System.out.println("cos pi: " + e);
		System.out.println("max of 10 and 100: " + f);
		System.out.println("min of 10 and 100: " + g);
		System.out.println("power of 2 to the 5: " + h);
		System.out.println("random: " + i);
		System.out.println("sin of pi: " + j);

		// on the AP Exam these show up \/ \/ \/
		x = Math.pow(Math.log(x) - Math.cos(x + 56.2), Math.min(Math.random(), Math.random()));
		System.out.println("Big math Operation: " + x);

		int num = -9;
		double z = Math.pow(Math.abs(num) - Math.floor(x), Math.max(num, Math.floor(x)));
		System.out.println("z: " + z);

		System.out.println("Random Behavior!");
		double mys = Math.random();
		System.out.println("rand: " + mys); // between 0 and 1
		int mys2 = (int) Math.ceil(Math.random() * 100); // between 1 and 100
		System.out.println("rand2: " + mys2);
		int lower = 5;
		int upper = 7;
		int random = (int) Math.floor(Math.random() * (upper - lower + 1)) + lower;// general formula for whole numbers
																					// between upper and lower bound.
		System.out.println(random);
	}
}
