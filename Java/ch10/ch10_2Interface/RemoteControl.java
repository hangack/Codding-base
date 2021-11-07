package ch10_2Interface;

public interface RemoteControl {
	//상수 (public static final)이 interface 필드의 기본값
	//인터페이스 변수는 대문자와 _로 작성하는게 권장사항
	int MAX_VOLUME = 10;
	int MIN_VOLUME = 0;
	
	//interface에서 메소드는 추상 클래스 형식(Abstract)만 사용한다. 
	void turnOn();
	void turnOff();
	void setVolume(int volume);

}
