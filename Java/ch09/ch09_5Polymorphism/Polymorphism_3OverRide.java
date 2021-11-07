package ch09_5Polymorphism;

public class Polymorphism_3OverRide {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calc3 calc = new Calc3();
		Line line = new Line();
		Rect rect = new Rect();
		Calc3 p = new Line();
		Calc3 r = rect;
		calc.draw();
		line.draw();
		p.draw();			//	오버라이드된 경우 자식 메소드가 우선
		r.draw();			//	다중 상속의 경우 최종 자식 클래스가 우선
		
		Calc3 rect2 = new Rect();
		Calc3 circle = new Circle();
		rect2.draw();
		circle.draw();

	}

}
