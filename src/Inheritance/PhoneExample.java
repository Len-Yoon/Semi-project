package Inheritance;

public class PhoneExample {

	public static void main(String[] args) {
		
		SmartPhone smartphone = new SmartPhone("홍길동");
		
		smartphone.owner();
		smartphone.turnOn();
		smartphone.internetSearch();
		smartphone.turnOff();

	}

}
