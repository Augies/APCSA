package net.cox.augies.school.apcsa.fall.five;

import java.util.ArrayList;
import java.util.Random;

/**
 * Why can't this be done in the same class as ArrayLists Introduction? :(
 * @author Augies
 *
 */
public class SetStuff {
	public static void main(String[] args) {
		ArrayList<Integer> nums = new ArrayList<>();
		Random rng = new Random();
		for(int i = 0; i < 5; i++) {
			nums.add(rng.nextInt(100)+1);
		}
		nums.set(3, 200);
	}
}
