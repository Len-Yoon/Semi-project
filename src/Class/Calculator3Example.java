package Class;

public class Calculator3Example {

	public static void main(String[] args) {
		
		Calculator3 myCalc = new Calculator3();
		
		//정사각형 넓이
		double result1 = myCalc.areaRectangle(10);
		System.out.println("10cm 정사각형 넓이: "+result1+"cm");
		
		double result2 = myCalc.areaRectangle(10, 20);
		System.out.println("10cm,20cm 직사각형 넓이: "+result2+"cm");

	}

}
