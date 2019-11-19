package net.cox.augies.school.apcsa.fall.three;

public class Student {
	String grade;
	String name;
	boolean present;
	
	public Student(String grade, String name) {
		this.grade= grade;
		this.name = name;
		this.present = true;
	}
	
	public Student(String grade, String name, boolean present) {
		this.grade= grade;
		this.name = name;
		this.present = present;
	}
}
