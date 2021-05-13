package Interface;

public class Driver {
	
	public void drive(Vehicle vehicle) {
		if(vehicle instanceof Bus) {
			Bus bus = (Bus) vehicle;
			bus.CheckFare();
		}
		
		vehicle.run();
	}

}
