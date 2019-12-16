package net.cox.augies.school.apcsa.fall.four;

import net.cox.augies.utils.java.ArrUtils;
import net.cox.augies.utils.java.MathUtils;

import java.util.Scanner;

public class FunkyFreshStrings {
	
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String [] args) {
		System.out.println("A for Palindrome Checker");
		System.out.println("B for Converting to Caesar");
		System.out.println("C for Converting from Caesar");
		System.out.println("D for the Word Guessing Game");
		System.out.println("E for String Scrambling");
		System.out.println("F for Sorting Alphabetically");
		System.out.println("G for String Char Proportions");
		String resp = sc.nextLine().toLowerCase();
		switch(resp) {
		case "a":
			System.out.println("Enter your String");
			System.out.println(isPalindrome(sc.nextLine()));
			break;
		case "b":
			System.out.println("Enter your String");
			String toCaesarResp = sc.nextLine();
			System.out.println("Enter your Shift");
			String toCaesarShift = sc.nextLine();
			System.out.println(toCaesarCipher(toCaesarResp, Integer.parseInt(toCaesarShift)%26));
			break;
		case "c":
			System.out.println("Enter your String");
			String fromCaesarResp = sc.nextLine();
			System.out.println("Enter your Shift");
			String fromCaesarShift = sc.nextLine();
			System.out.println(fromCaesarCipher(fromCaesarResp, Integer.parseInt(fromCaesarShift)%26));
			break;
		case "e":
			System.out.println("Enter your String");
			System.out.println(scrambleString(sc.nextLine()));
			break;
		case "d":
			doGuessGame();
			break;
		case "f":
			System.out.println("Enter your String");
			String alphaSortString = sc.nextLine();
			System.out.println(sortAlphabetical(alphaSortString));
			break;
		case "g":
			System.out.println("Enter your String");
			String alphaPropString = sc.nextLine();
			System.out.println("[a,b,c,d,e,f,g,h,i,j,k,l,m,n,o,p,q,r,s,t,u,v,w,x,y,z]");
			ArrUtils.printArray(getProportions(alphaPropString));
			break;
		default:
			System.out.println("Dude. Please enter a valid option");
			break;
		}
		main(null); //too lazy to properly loop through
	}
	
	public static String toCaesarCipher(String s, int shift) {
		shift%=26;
		char[] c = s.toCharArray();
		for(int i = 0; i < c.length; i++) {
			if(isLetter(c[i])) {
				c[i] = !isLetter((char)((int)c[i]+shift)) ? (char)((int)c[i]-26+shift):(char)((int)c[i]+shift);
			}
		}
		return new String(c);
	}
	
	public static String fromCaesarCipher(String s, int shift) {
		shift%=26;
		char[] c = s.toCharArray();
		for(int i = 0; i < c.length; i++) {
			if(isLetter(c[i])) {
				c[i] = !isLetter((char)((int)c[i]-shift)) ? (char)((int)c[i]+26-shift):(char)((int)c[i]-shift);
			}
		}
		return new String(c);
	}
	
	public static String toScrubbedHTMLString(String s) {
		while(s.indexOf('<')!=-1&&s.indexOf('>')!=-1) {
			s = s.substring(0,s.indexOf('<'))+s.substring(s.indexOf('>')+1,s.length());
		}
		return s;
	}
	
	public static String toScrubbedString(String a) {
		char [] b = a.toCharArray();
		for(int i = 0; i < b.length; i++) {
			if(!isLetter(b[i])) {
				b[i] = ' ';
			}
		}
		return new String(b);
	}
	
	public static boolean isLetter(char a) {
		return (a>64&&a<91)||(a>96&&a<123);
	}
	
	public static boolean isPalindrome(String s) {
		s = getOnlyLetters(s.toLowerCase());
		String temp = "";
		for(int i = s.length()-1; i >=0; i--) {
			temp+=s.charAt(i);
		}
		System.out.println("Your String : " + s);
		System.out.println("It Reversed : " + temp);
		if(temp.equals(s)) {
			return true;
		}
		return false;
	}
	
	public static String getOnlyLetters(String s) {
		for(int i = 0; i < s.length(); i++) {
			if(!isLetter(s.charAt(i))) {
				s = s.substring(0, i) + s.substring(i+1,s.length());
			}
		}
		return s;
	}
	
	public static String getBackwardsString(String s) {
		String temp = "";
		for(int i = s.length()-1; i >= 0; i--) {
			temp+=s.charAt(i);
		}
		return temp;
	}
	
	public static void doGuessGame() {
		String answer = "zebra";
		System.out.println("The amount of digits is " + answer.length());
		System.out.println("Enter your Guess");
		doGuessGameTurn(sc.nextLine().toLowerCase(), answer);
	}
	
	public static void doGuessGameTurn(String guess, String answer) {
		if(guess.length()!=answer.length()) {
			System.out.println("Bruh. Gotta guess the same number of digits");
			main(null);
		}
		if(!guess.equals(answer)) {
			char[] output = new char[answer.length()];
			for(int i = 0; i < answer.length(); i++) {
				if(guess.charAt(i)==answer.charAt(i)) {
					output[i]=guess.charAt(i);//char in right position
				}else if(answer.contains(guess.substring(i, i+1))) {
					output[i]='+';//contains the char
				}else {
					output[i]='*';//does not contain the char
				}
			}
			System.out.println(new String(output));
			System.out.println("Enter your next Guess");
			doGuessGameTurn(sc.nextLine().toLowerCase(), answer);
		}else {
			System.out.println("You won!");
			System.out.println("The phrase was: \"" + answer + "\"");
			main(null);
		}
	}
	
	public static String scrambleString(String s) {
		char[] schars = s.toCharArray();
		char[] scrambled = new char[schars.length];
		for(int i = 0; i < schars.length; i++) {
			int random = MathUtils.randomWithRange(0, s.length());
			if(schars[random]!='\u5856') {
				scrambled[i]=schars[random];
				schars[random]='\u5856';
			}else {
				i--;
			}
		}
		return new String(scrambled);
	}
	
	
	
	public static boolean isAlphabetical(String s) {
		s=s.toLowerCase();
		s=getOnlyLetters(s);
		for(int i = 0; i < s.length()-1; i++) {
			if((int)s.charAt(i)>(int)s.charAt(i+1)) {
				return false;
			}
		}
		return true;
	}
	
	public static String sortAlphabetical(String s) {
		s=s.toLowerCase();
		s=getOnlyLetters(s);
		while(!isAlphabetical(s)) {
			for(int i = 0; i < s.length()-1; i++) {
				if((int)s.charAt(i)>(int)s.charAt(i+1)) {
					s=s.substring(0,i) + s.charAt(i+1) + s.charAt(i) + s.substring(i+2,s.length());
				}
			}
		}
		return s;
	}
	
	public static int[] getProportions(String s) {
		s=sortAlphabetical(s.toLowerCase());
		int[] proportions = new int[26];
		for(int i = 0; i < proportions.length; i++) {
			String temp = "" + (char)(i+97);
			if(s.contains(temp)) {
				int count = 0;
				for(int j = 0; j < s.length(); j++) {
					if(s.charAt(j)==(char)i+97) {
						count++;
					}
				}
				proportions[i]=count;
			}
		}
		return proportions;
	}
}
