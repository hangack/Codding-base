package ch09_5Polymorphism;

public class Calc3 {
	public Calc3() {}
	public void draw() {
		System.out.println("calc draw");
	}

}

class Line extends Calc3 {
	@Override
	public void draw() {
		System.out.println("Line Draw");
	}
	
}
class Rect extends Line {
	@Override
	public void draw() {
		System.out.println("Rect Draw");
	}
	
}
class Circle extends Rect {
	@Override
	public void draw() {
		System.out.println("Circle Draw");
	}
	
}
