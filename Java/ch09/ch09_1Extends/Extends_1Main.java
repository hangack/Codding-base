package ch09_1Extends;

public class Extends_1Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child01 child = new Child01("자바폰", "검정", 10);		//자식 클래스 사용 -> 부모 객체 함께 생성
		
		//부모 클래스로부터 상속받은 필드
		System.out.println("상속받은 모델: "+child.model);
		System.out.println("상속받은 색상: "+child.color);
		//자식 클래스 필드
		System.out.println("자식 클래스 채널: "+child.channel);
		
		//상속받은 메소드 호출
		child.powerOn();
		child.bell();
		child.sendVoice("안녕하세요");
		child.receiveVoice("안녕하세요~");
		child.sendVoice("무슨 일 있으신가요?");
		child.hongUp();
		
		//자식클래스 메소드 호출
		child.turnOn();
		child.changeChannel(56);
		child.turnOff();

	}

}
