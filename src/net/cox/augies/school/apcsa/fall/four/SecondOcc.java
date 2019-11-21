package net.cox.augies.school.apcsa.fall.four;

public class SecondOcc {
	public static void main(String [] args) {
		String sassy = "i put the miss in mississippi";
		String temp = sassy;
		int firstIndex = temp.indexOf("miss");
		temp = temp.substring(temp.indexOf("miss")+"miss".length(), temp.length());
		System.out.println(temp);
		int secondIndex = temp.indexOf("miss") + firstIndex + "miss".length();
		System.out.println(sassy.indexOf("miss"));
		System.out.println(secondIndex);
		
		String ohNo = "i put the cute in execute";
		System.out.println(findOccurrenceOf(ohNo, 3, "ut"));
		
		String oh = ohNo;
		
	}
	
	public static int findOccurrenceOf(String s, int occurrencenum, String substring) {
		if(occurrencenum<2) { //Shouldn't use this method for the 0 occurrence or 1st
			return -1;
		}
		int [] indexes = new int[occurrencenum-1];
		for(int i = 0; i < occurrencenum-1; i++) {
			indexes[i]=s.indexOf(substring);
			s=s.substring(s.indexOf(substring)+substring.length(), s.length());
		}
		int totalIndex = 0;
		for(int i = 0; i < indexes.length; i++) {
			totalIndex+=indexes[i]+substring.length();
		}
		totalIndex+=s.indexOf(substring);
		return totalIndex;
	}
}
