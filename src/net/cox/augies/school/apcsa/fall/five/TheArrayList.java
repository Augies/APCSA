package net.cox.augies.school.apcsa.fall.five;

import java.util.Scanner;
import java.util.ArrayList;

public class TheArrayList {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<String> names = new ArrayList<>();
		System.out.println("How many names you want to import?");
		int numberOfNames = Integer.parseInt(sc.nextLine());
		for(int i = 0; i < numberOfNames; i++) {
			System.out.println("Enter name " + (i+1));
			names.add(sc.nextLine());
		}
		for(String i : names) {
			System.out.println(i);
		}
	}
}
