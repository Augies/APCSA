package net.cox.augies.school.apcsa.fall.one;

import java.util.Scanner;

/**
 * Use a for loop and integer of 65, print alphabet to the screen by adding one
 * to integer then casting it to a char, and printing it
 * 
 * @author augies
 *
 */
public class Alpha {
	static Scanner scln = new Scanner(System.in);
	static int start;

	public static void main(String[] args) {
		System.out.println("Lower case or Upper case? (L/U)");
		String answer = scln.nextLine().toUpperCase();
		if (answer.equals("U")) {
			start = 65;// start of upper case
		} else {
			start = 97;// start of lower case
		}
		for (int i = start; i < start + 26; i++) {
			System.out.print((char) i);
		}
	}
}
