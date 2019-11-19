package net.cox.augies.school.apcsa.fall.one;

import java.util.Scanner;

public class Conditional {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Hey are you cool? (y/n)");
		String resp = sc.nextLine();
		if (resp.toLowerCase().equals("y") || resp.toLowerCase().equals("yes")) {
			System.out.println("That's awesome!"); // two options, one response
		} else {
			System.out.println("Oh. That sucks bud.");
		}

		int x = 9;

		if (x > 8) { // two options, two responses
			System.out.println("Almost 10");
		} else if (x == 9) {
			System.out.println("Close to 10");
		} else if (x > 9) {
			System.out.println("It's 10");
		} else {
			System.out.println("I don't know what it is");
		}

		// Same as check below but with less options for responses.
		if (x > 8) {
			System.out.println("Almost 10");
		} else {
			System.out.println("I don't know what it is");
		}

		String choice = "yes";
		if (choice.equals("yes") && choice.equals("yeah")) {
			// always returns false in if statement. Never gets to this code.
		}
		if (choice.equals("yes") || choice.equals("yeah")) {
			// can sometimes return true in if statement
		}

// every comparison statement (if, while, for, etc) has to evaluate to a boolean
// expression

//		AND &&
//		T + T = T
//		T + F = F
//		F + T = F
//		F + F = F

//		OR ||
//		T + T = T
//		T + F = T
//		F + T = T
//		F + F = F

	}
}
