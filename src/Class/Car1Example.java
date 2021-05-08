package Class;

public class Car1Example {

	public static void main(String[] args) {
		
		Car1 myCar = new Car1();
		
		System.out.println("제작회사: "+myCar.company);
		System.out.println("모델명: "+myCar.model);
		System.out.println("색상: "+myCar.color);
		System.out.println("최고속도: "+myCar.maxspeed);
		System.out.println("현재속도: "+myCar.speed);
		
		myCar.speed = 100;
		System.out.println("수정된 현재속도: "+myCar.speed);

	}

}
