package Inheritance;

public class DmbCellPhoneExample {

	public static void main(String[] args) {
		
		//DmbCellPhone 객체 생성
		DmbCellPhone dmbCellPhone = new DmbCellPhone("갤럭시 S10", "화이트", 10);
		
		//CellPhone으로부터 상속받은 필드 
		System.out.println("모델: "+dmbCellPhone.model);
		System.out.println("색상: "+dmbCellPhone.color);
		
		//DmbCellPhone의 필드
		System.out.println("채널: "+dmbCellPhone.channel);
		
		//CellPhone으로부터 상속받은 메소드 호출
		dmbCellPhone.powerOn();
		dmbCellPhone.bell();
		dmbCellPhone.sendVoice("여보세요?");
		dmbCellPhone.receiveVoice("안녕하세요 호갱님! XXX입니다.");
		dmbCellPhone.sendVoice("뭐라고요? 호갱? 미쳤어요?");
		dmbCellPhone.hangUp();
		
		//DmbCellPhone의 메소드 호출
		dmbCellPhone.turnOnDmb();
		dmbCellPhone.changeChannelDmb(18);
		dmbCellPhone.turnOffDmb();

	}

}
