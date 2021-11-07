package ch09_1Extends;

public class Child01 extends Parent01 {
	int channel;
	Child01(String model, String color, int channel){
		this.model = model;		//	this.model = 부모 클래스 멤버
		this.color = color;		//	this.color = 부모 클래스 멤버
		this.channel = channel;
	}
	
	void turnOn() {
		System.out.println("채널: "+channel+"번 방송 수신");
	}
	void changeChannel (int channel) {
		System.out.println("채널을 "+channel+"번으로 변경");
	}
	void turnOff() {
		System.out.println("방송 중단");
	}

}
