package Class;

public class Car2Example {

	public static void main(String[] args) {
		
		Car2 c1 = new Car2("폭스바겐", "뉴cc", "화이트", 280);
		System.out.println("c1.company: "+c1.company);
		System.out.println("c1.model: "+c1.model);
		System.out.println("c1.color: )"+c1.color);
		System.out.println("c1.maxSpeed: "+c1.maxSpeed);
		
		Car2 c2 = new Car2("기아", "K5", "화이트", 240);
		System.out.println("c2.company: "+c2.company);
		System.out.println("c2.model: "+c2.model);
		System.out.println("c2.color: )"+c2.color);
		System.out.println("c2.maxSpeed: "+c2.maxSpeed);

	}

}
