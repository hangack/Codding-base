package ch09_1Extends;

public class Parent01 {
	String model,color;
	
	void powerOn() {System.out.println("powerOn");}
	void powerOff() {System.out.println("powerOff");}
	void bell() {System.out.println("bell");}
	void sendVoice(String message) {System.out.println("자신: "+message);}
	void receiveVoice(String message) {System.out.println("상대: "+message);}
	void hongUp() {System.out.println("전화를 끊습니다");}
	

}
