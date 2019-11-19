package net.cox.augies.school.apcsa.fall.three;

import java.util.Scanner;

/**
 * 1)Present options to the user
 * 2)User selects 1 of the options
 * 3)If method returns true, add to successes
 * 4)If successes = 3, congrats you are a doctor
 * 5)if < 3, sorry bud, maybe study a bit more
 * @author augies
 *
 */
public class Trainer {
	public static void main(String [] args) {
		int successes = 0;
		Dog medStudent1 = new Dog();
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		int choice;
		int fails = 0;
		for(int i = 0; i < 5 && successes<3; i++) {
			System.out.println("What will you do?");
			System.out.println("1: Check for a Limp.");
			System.out.println("2: Check Hearing");
			System.out.println("3: Give Medicine");
			choice = sc.nextInt();
			switch(choice) {
			case 1:
				if(medStudent1.checkLimp()) {
					successes++;
				}else {
					fails++;
				}
				break;
			case 2:
				if(medStudent1.checkHearing()) {
					successes++;
				}else {
					fails++;
				}
				break;
			case 3: 
				if(medStudent1.giveMedicine()) {
					successes++;
				}else {
					fails++;
				}
				break;
			default:
				System.out.println("Why did you do nothing???");
				break;
			}
		}
		if(successes>=3) {
			System.out.println("Congrats you're a doctor now");
			System.out.println("You got " + successes + " Procedures right!");
			System.out.println("You got " + fails + " Procudures wrong.");
		}else {
			System.out.println("Sorry bud, maybe study a bit harder");
		}
	}
}
