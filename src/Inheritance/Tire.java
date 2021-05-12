package Inheritance;

public class Tire {
	
	//필드
	public int maxRotation; //최대 회전수(수명)
	public int accumluatedRotation; //누적 회전수
	public String location; //타이어의 위치 
	
	//생성자
	public Tire(String location, int maxRotation) {
		this.location = location;
		this.maxRotation = maxRotation;
	}
	
	//메소드
	public boolean roll() {
		++accumluatedRotation;
		if(accumluatedRotation<maxRotation) {
			System.out.println(location+" Tire 수명: "+ (maxRotation-accumluatedRotation)+"회");
			return true;
		} else {
			System.out.println("*** "+location+" Tire 펑크 ***");
			return false;
		}
	}
	

}
