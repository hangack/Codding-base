package ch10_Interface_EX;

public class Ex02_implements implements Ex02 {
	@Override
	public void makeThis() {
		System.out.println("make This method 실행");
	}
	@Override
	public void makeThisWith(String name, int age) {
		System.out.printf("With method 실행, 매개변수: %s,%d",name,age);
	}

}
