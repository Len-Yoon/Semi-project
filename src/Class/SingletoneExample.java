package Class;

public class SingletoneExample {

	public static void main(String[] args) {
		
		//컴파일 에러 
//		Singletone obj1 = new Singletone(); 
//		Singletone obj2 = new Singletone(); 
		
		
		Singletone obj1 = Singletone.getInstance();
		Singletone obj2 = Singletone.getInstance();
		
		if(obj1 == obj2) {
			System.out.println("같은 Singletone 객체입니다.");
		} else {
			System.out.println("다른 Singletone 객체입니다.");
		}
		
	}

}
