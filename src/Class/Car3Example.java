package Class;

public class Car3Example {

	public static void main(String[] args) {
		Car3 myCar = new Car3();
		
		myCar.setGas(6); //Car3의 setGas메소드 호출
		
		boolean gasState = myCar.isLeftGas();
		if(gasState) {
			System.out.println("출발합니다");
			myCar.run();
		}
		
		if(myCar.isLeftGas()) {
			System.out.println("gas를 주입할 필요가 없습니다");
		} else {
			System.out.println("가스를 주입하세요");
		}

	}

}
