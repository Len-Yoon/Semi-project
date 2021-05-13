package Interface;

public class VehicleExample {

	public static void main(String[] args) {
		
		Vehicle vehicle = new Bus();
		
		vehicle.run();
		//vehicle.checkFare(); 읽기 불가능
		
		Bus bus = (Bus) vehicle;
		
		bus.run();
		bus.CheckFare();
	}

}
