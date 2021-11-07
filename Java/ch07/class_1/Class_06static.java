package class_1;

public class Class_06static {
	
	public static void main(String[] args) {
		double circle = 10*10*Calc06.pi;	// static(정적) 멤버의 경우 객체를 생성하지 않고 사용할 수 있는 필드(ex: pi) 및 메소드.
		int plus = Calc06.plus(10, 5);
		int minus = Calc06.minus(10, 5);
		System.out.printf("%f\n%d, %d",circle,plus,minus);
		
	}

}
