package ch09_5Polymorphism;

public class Polymorphism_6instanceof {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Parent06 parentA = new Child06();
		method1(parentA);
		
		Parent06 parentB = new Parent06();
		method1(parentB);

	}
	public static void method1(Parent06 parent) {	//	다형성 메소드: "타입 변수명"을 메소드 내부 참조에 넣어서 메소드 내부 변수로 사용
		if(parent instanceof Child06) {			//	if (instanceof): 타입 변환이 가능한지 확인
			Child06 Child = (Child06)parent;	//	Parent06 -> Child06	타입 강제 변환
			System.out.println("m1 - child 변환 성공");
		}else {
			System.out.println("m1 - child 변환 실패");
		}
		
	}

}


class Parent06{}
class Child06 extends Parent06{}
