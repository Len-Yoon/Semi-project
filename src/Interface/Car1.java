package Interface;

public class Car1 {
	
	Tire[] tires = {
			new HankookTire(),
			new HankookTire(),
			new KumhoTire(),
			new KumhoTire()
	};
	
	void run() {
		for(Tire tire : tires) {
			tire.roll();
		}
	}

}
