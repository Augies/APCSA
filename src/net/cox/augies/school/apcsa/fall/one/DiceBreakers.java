package net.cox.augies.school.apcsa.fall.one;

import java.util.Random;
import java.util.Scanner;

public class DiceBreakers {
	static Scanner scln = new Scanner(System.in);
	static Random rng = new Random();
	static String cont = null;
	static String[] icebreakers = { "If you could go anywhere in the world, where would you go?",
			"If you were stranded on a desert island, what three things would you want to take with you?",
			"If you could eat only one food for the rest of your life, what would it be?",
			"If you won a million dollars, what is the first thing you would buy?",
			"If you could spend the day with one fictional character, who would it be?",
			"If you found a magic lantern and a genie gave you three wishes, what would you wish?" };

	public static void main(String[] args) {
		System.out.println("Would you like to play an Ice Breakers game? (y/n)");
		cont = scln.nextLine().toLowerCase();
		while (cont.equals("y")) {
			int randomNum = rng.nextInt(6);
			System.out.println("You Rolled a " + (randomNum + 1) + "!");
			System.out.println(icebreakers[randomNum]);
			System.out.println("Would you like to continue? (y/n)");
			cont = scln.nextLine().toLowerCase();
		}
	}
}