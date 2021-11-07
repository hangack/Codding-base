package ch02_3DataType;

public class TypeChange {	// 자동 타입 변환
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		byte byteValue = 10;
		System.out.println("byteValue: "+byteValue);

		int intValue = byteValue;
		System.out.println("intValue: "+intValue);

		char charValue = '가';
		intValue = charValue;
		System.out.println("가의 유니코드: "+intValue);

		intValue = 50;
		long longValue = intValue;
		System.out.println("longValue: "+longValue);

		longValue = 100;
		float floatValue = longValue;
		System.out.println("floatValue: "+floatValue);

		floatValue = 100.5f;
		double doubleValue = floatValue;
		System.out.println("doubleValue: "+doubleValue);
		System.out.printf("doubleValue: %15.15f",floatValue);
	}
	
	// 상위 개념으로 타입 변환은 자유롭다.

}
