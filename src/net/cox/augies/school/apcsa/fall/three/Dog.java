package net.cox.augies.school.apcsa.fall.three;

import java.util.Scanner;

public class Dog {
	private int legCount = 4;
	String ears = "floppy";
	String name = "sparks";
	boolean fur = true;
	
	public boolean checkLimp() {
		Scanner s = new Scanner(System.in);
		System.out.println("Hey Champ come here 1-Treat 2-Vaccuum");
		int choice = s.nextInt();
		if(choice==1) {
			System.out.println("Good legs: " + legCount);
			return true;
		}else {
			legCount--;
			System.out.println("NOPE: " + legCount);
			return false;
		}
	}
	
	public boolean giveMedicine() {
		Scanner s = new Scanner(System.in);
		System.out.println("How much medicine?");
		int amount = s.nextInt();
		if(amount>100 || amount<20) {
			this.fur = false;
			System.out.println("Ouch!");
			return false;
		}else {
			System.out.println("YAY");
			return true;
		}
	}
	
	public boolean checkHearing() {
		Scanner s = new Scanner(System.in);
		System.out.println("Check ears Type 1-bell 2-trombone");
		int choice = s.nextInt();
		if(choice==1) {
			System.out.println("Yay all good");
			System.out.println(ears);
			return true;
		}else{
			ears = "ouchy";
			System.out.println(ears);
			return false;
		}
	}
}
