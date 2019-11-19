package net.cox.augies.school.apcsa.fall.one;

/**
 * What can be done with the data type, add, subtract, multiply, divide, etc.
 * 
 * @author augies
 */
public class Operators {
	public static void main(String[] args) {
		int x = 4;
		int y = 7;
		double quot = (double) x / (double) y;
		System.out.println("quot of double division: " + quot);

		String name = "augie";
		// Cannot cast String to an integer

		quot = x / y; // 10/2
		System.out.println("quot of int division: " + quot);

		int number2 = 7;
		int number3 = 3;
		int result = number2 % number3;
		System.out.println("result of modulus: " + result);
		// 7/3 = 2 remainder 1. Prints 1
	}
}
