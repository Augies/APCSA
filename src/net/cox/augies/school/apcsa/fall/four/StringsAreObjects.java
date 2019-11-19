package net.cox.augies.school.apcsa.fall.four;

public class StringsAreObjects {
	public static void main(String [] args) {
		String a = new String("a");
		a.concat("a");
		System.out.println(a);
		a = a.concat("a");
		System.out.println(a);
	}
}
