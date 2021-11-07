package ch10_3Interface_Polymorphism;

class Kumho implements Tire {
	@Override
	public void roll() {
		System.out.println("금호타이어");
	}
}
class Hankook implements Tire {
	@Override
	public void roll() {
		System.out.println("한국타이어");
	}
}


public class Car {
	Tire fL = new Hankook();
	Tire fR = new Hankook();
	Tire bL = new Hankook();
	Tire bR = new Hankook();
	
	void run() {
		fL.roll();
		fR.roll();
		bL.roll();
		bR.roll();
	}
}
