package demo;

public class Dog {
	private String dogName;
	private int dogAge;
	private String dogColor;
	private boolean dogSex;
	
	public Dog()
	{
	}
	
	public Dog(String dogName, int dogAge, String dogColor, boolean dogSex) {
		super();
		this.dogName = dogName;
		this.dogAge = dogAge;
		this.dogColor = dogColor;
		this.dogSex = dogSex;
	}

	public String getDogName() {
		return dogName;
	}
	public void setDogName(String dogName) {
		this.dogName = dogName;
	}
	public int getDogAge() {
		return dogAge;
	}
	public void setDogAge(int dogAge) {
		this.dogAge = dogAge;
	}
	public String getDogColor() {
		return dogColor;
	}
	public void setDogColor(String dogColor) {
		this.dogColor = dogColor;
	}
	public boolean isDogSex() {
		return dogSex;
	}
	public void setDogSex(boolean dogSex) {
		this.dogSex = dogSex;
	}

	@Override
	public String toString() {
		return "Dog [dogAge=" + dogAge + ", dogColor=" + dogColor
				+ ", dogName=" + dogName + ", dogSex=" + dogSex + "]";
	}
	
	

}
