package ch09_5Polymorphism;

class a{
	public String x() {
		return "x";
	}
}
class b extends a{
	@Override
	public String x() {
		return "b.x";
	}
	public String y() {
		return "y";
	}
}
class b2 extends a{
	@Override
	public String x() {
		return "b2.x";
	}
}

public class Polymorphism_2 {
//	public이 들어가는 클래스가 파일명

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		a ex = new b();
		a ex2 = new b2();
		System.out.println(ex.x());
//		System.out.println(ex.y());		//	부모 타입의 인스턴스로 자식 형식의 메소드는 불러 올 수 없음.
		System.out.println(ex2.x());	//	오버라이드의 경우 자식이 우선

	}

}
