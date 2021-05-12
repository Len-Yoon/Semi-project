package Inheritance;

public class ChildExample {

	public static void main(String[] args) {
		
		Child child = new Child();
		
		Parent parent = child;
		parent.method1();
		parent.method2(); //제 정의된 메소드 호출
		//parent.method3(); 호출 불가능

	}

}
