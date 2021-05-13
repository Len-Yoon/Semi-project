package Interface;

public class Car1Example {

	public static void main(String[] args) {
		Car1 myCar = new Car1();
		
		myCar.run();
		
		myCar.tires[0] = new KumhoTire();
		myCar.tires[1] = new KumhoTire();
		
		myCar.run();
	}

}
