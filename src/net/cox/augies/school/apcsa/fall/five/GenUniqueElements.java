package net.cox.augies.school.apcsa.fall.five;

import java.util.ArrayList;

public class GenUniqueElements {
	public static void main(String[] args) {
		ArrayList<Integer> x = new ArrayList<>();
		
		for(int i = 5; i < 23; i++) {
			x.add(i*4);
		}
		ArrayList<Integer> xrand = new ArrayList<>();
		while(x.size()>0) {
			int rand = (int)(Math.random()*x.size());
			xrand.add(x.get(rand));
			x.remove(rand);
		}
		System.out.println(xrand);
	}
}
