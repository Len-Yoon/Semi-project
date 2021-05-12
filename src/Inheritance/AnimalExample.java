package Inheritance;

public class AnimalExample {

	public static void main(String[] args) {
		
		Dog dog = new Dog();
		Cat cat = new Cat();
		dog.sound();
		cat.sound();
		System.out.println("ㅡㅡ");
		
		//변수의 자동 타입 변환
		Animal animal = null;
		animal = new Dog();
		animal.sound();
		animal = new Cat();
		animal.sound();
		System.out.println("ㅡㅡ");
		
		//메소드의 다형성
		animalSound(dog);
		animalSound(cat);

	}
	
	public static void animalSound(Animal animal) {
		animal.sound();
	}

}
