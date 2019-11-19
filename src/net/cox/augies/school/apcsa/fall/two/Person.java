package net.cox.augies.school.apcsa.fall.two;

public class Person {
	private int age = 0;
	private double height = 0.0;
	private String name = "";

	@Override
	public String toString() {
		return "Person [age=" + age + ", height=" + height + ", name=" + name + "]";
	}

	public Person(int age, double height, String name) {
		this.age = age;
		this.setHeight(height);
		this.name = name;
	}

	public void setValues(int age, double height, String name) {
		this.age = age;
		this.setHeight(height);
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

}
