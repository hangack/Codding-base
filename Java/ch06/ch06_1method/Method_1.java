package ch06_1method;

public class Method_1 {

	public static void main(String[] args) {		// main: 실행 메소드
		// TODO Auto-generated method stub
		int a = 30,b = 7;
//		Waldo(a);
		Calc1 myCalc = new Calc1();		// 같은 프로젝트 안에 있는 메소드를 불러온다.
		myCalc.powerOn();
		
		int result1 = myCalc.plus(a, b);
		System.out.println("result1: "+result1);
		
		byte x = 10;
		byte y = 4;
		double result2 = myCalc.divide(x, y);
		System.out.println("result2: "+result2);
		
		
		myCalc.powerOff();
	}
	public static void Waldo(int age) {
//	public static 리턴타입 메소드이름 (매개변수선언, ...)
//	private: 외부 class에서 접근 불가	{public:공공의, private:개인의}
//	stactic: 클래스 파일안에서 공유 가능 = 객체 생성과정 생략 ex) Calc1 myCalc = new Calc1();
// void: 기본 값(리턴을 받지 않음)
		System.out.println("힘쎄고 강한 아침");
		System.out.printf("제 나이는 %d입니다", age);
	}
}
