package ch10_1Abstract;

class Cat extends Animal{
	Cat() {
		super("고양이");
	}

	@Override
	void sound() {
		System.out.println("야옹");
	}
}

class Dog extends Animal{
	Dog() {
		super("강아지");
	}

	@Override
	void sound() {
		System.out.println("멍멍");
	}
	
}

public class Abstract_2animal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal cat = new Cat();
		Dog dog = new Dog();
//		Animal ami = new Animal();	//추상 클래스는 객체로 만들 수 없다.
		
		cat.sound();
		cat.breathe();
		dog.sound();
		dog.breathe();
		
	}

}
