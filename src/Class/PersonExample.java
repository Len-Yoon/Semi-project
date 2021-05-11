package Class;

public class PersonExample {

	public static void main(String[] args) {
		
		Person p1 = new Person("12345-12345", "홍길동");
		
		System.out.println(p1.nation);
		System.out.println(p1.ssn);
		System.out.println(p1.name);
		
		//final은 변경 불가

	}

}
