package Inheritance;

public class Child2Example {

	public static void main(String[] args) {
		
		Parent2 parent2 = new Child2();
		parent2.field1 = "data2";
		parent2.method1();
		parent2.method2();
		
		//parent2.field2 = "data2"; 불가능
		//parent2.method3(); 불가능
		
		Child2 child2 = (Child2) parent2;
		child2.field2 = "yyy"; //가능
		child2.method3();

	}

}
