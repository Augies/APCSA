package net.cox.augies.school.apcsa.fall.three;

import java.io.File;
import java.math.BigInteger;

public class Runner {
	static class AdvancedStuff{
		private int num = 1;
		static int num2 = 7;
		String test = "Bye";
		
		AdvancedStuff(int n, int x){
			num = n;
			num2 = x;
		}
		
		AdvancedStuff(int n){
			test = test+n;
			testIt(test);
		}
		
		private int addIt(int x) {
			num = num+x;
			System.out.println("NUM: " + num + " X:" + x);
			return num-1;
		}
		
		public char changeNumber(int x) {
			addIt(x+num);
			System.out.println("NUM: " + num + " X: " + x);
			return (char)(num+x);
		}
		
		public String makeWord(String z) {
			test = test+z;
			return test;
		}
		
		private String testIt(String z) {
			test = test+z;
			return "x";
		}
	}
	
	public static void main(String [] args) {
		AdvancedStuff b1 = new AdvancedStuff(7, 2);
		AdvancedStuff b2 = new AdvancedStuff(3);
		
		AdvancedStuff.num2 = AdvancedStuff.num2+1;
		
		b1.changeNumber(41);
		b1.makeWord("c");
		b2.changeNumber(35);
		b2.makeWord("e");
		System.out.println(b1.changeNumber(4));
		System.out.println(b2.changeNumber(4));
		System.out.println(b1.makeWord("a"));
		System.out.println(b2.makeWord("b"));
		System.out.println(b1.num2);
		System.out.println(b2.num2);
		System.out.println(b1.test);
		System.out.println(b2.test);
		b1.num2++;
		b2.num2++;
		System.out.println(b1.num2);
		System.out.println(b2.num2);
	}
}
