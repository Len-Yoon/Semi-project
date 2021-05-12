package Inheritance;

public class HankookTire extends Tire {

	public HankookTire(String location, int maxRotation) {
		super(location, maxRotation);
	}
	
	//메소드
	@Override
	public boolean roll() {
		++accumluatedRotation;
		if(accumluatedRotation<maxRotation) {
			System.out.println(location+" HankookTire 수명: "+(maxRotation-accumluatedRotation)+"회");
			return true;
		} else {
			System.out.println("*** "+location+" HankookTire 펑크 ***");
			return false;
		}
	}

}
