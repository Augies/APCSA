package net.cox.augies.school.apcsa.fall.four;

public class OverloadedStrings {
	public static void main(String [] args) {
		String x = "     hello  ";
		x = x.trim();
		System.out.println(x);
		
		String y = "Meet me on Monday";
		y = y.replaceAll("e",  "%");
		System.out.println(y);
		
		y=y.replaceFirst("M", "7");
		System.out.println(y);
		
		/**
		 * Full functionality of charAt(), indexOf(), substring()
		 */
		
		//Substring
		String name = "Computer Science";
		name = name.substring(0,6);
		System.out.println(name);
		name = name.substring(3);
		System.out.println(name);
		
		String mys = "Monday Tuesday78 day hello";
		mys = mys.trim();
		int index = mys.indexOf("m");
		System.out.println(index);
		int index2 = mys.indexOf('d');
		System.out.println(index2);
		String test2 = "ues";
		int index4 = mys.indexOf(" " + test2);
		int index3 = mys.indexOf(" day ");
		System.out.println(index2);
		
		String test = "hello";
		System.out.println(test.charAt(2));
	}
}
