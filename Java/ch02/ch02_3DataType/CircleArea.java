package ch02_3DataType;

public class CircleArea {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		float PI = 3.14f;
		double radius = 10.2;
		double circleArea = radius*radius*PI;	// Java 자체 제곱 연산자는 없음.

		System.out.println("반지름 "+radius+", ");
		System.out.println("원의 면적 = "+circleArea);
		
	}

}
