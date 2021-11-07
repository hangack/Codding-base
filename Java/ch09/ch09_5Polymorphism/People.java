package ch09_5Polymorphism;

public class People {
	public void printInfo() {
		System.out.println("사람입니다");
	}
}
class Man extends People{
	@Override
	public void printInfo() {
		super.printInfo();
		System.out.println("남성");
	}
	
	public void enlist() {
		System.out.println("군바");
	}
}
class Woman extends People{
	@Override
	public void printInfo() {
		super.printInfo();
		System.out.println("여성");
	}
	public void working() {
		System.out.println("w");
	}
}
