package Inheritance;

public class Dog extends Animal {
	
	public Dog() {
		this.kind = "표유류";
	}

	@Override
	public void sound() {
		System.out.println("멍멍");

	}

}
