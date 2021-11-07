package ch10_4Interface_Extends;

public class implementationC implements C {
	public void methodA() {
		System.out.println("methodA 실체도 있어야한다.");
	}
	public void methodB() {
		System.out.println("methodA 실체도 있어야한다.");
	}
	public void methodC() {
		System.out.println("methodA 실체도 있어야한다.");
	}

}

class implementationAB implements A,B{		//	인터페이스 다중 구현 가능
	public void methodA() {
		System.out.println("methodA 실체도 있어야한다.");
	}
	public void methodB() {
		System.out.println("methodA 실체도 있어야한다.");
	}
}
