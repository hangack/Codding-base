package ch02_3DataType;

public class FloatDouble {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//실수 값 저장
	//	float var1 = 3.14;
		float var2 = 3.14f;		// 실수형 float 타입의 경우 Java에선 반드시 f를 붙여줘야함
		double var3 = 3.14;
		
		//정밀도 테스트
		float var4 = 0.1234567890123456789f;
		double var5 = 0.1234567890123456789;
		double var6 = 0.1234567890123456789f;

		System.out.println("var2: "+var2);
		System.out.println("var3: "+var3);
		System.out.println("var4: "+var4);	//0.12345679				8에서 반올림
		System.out.println("var5: "+var5);	//0.123456789012345678(9)
		System.out.println("var6: "+var6);	//0.1234567/9/104328156		8에서 반올림 후?
		double var10 = var4;
		System.out.println("var10: "+var10);//							자동 타입 변환
		
		
		//e(exponential: 지수) 사용하기
		double var7 = 3e6;
		float var8 = 3e6f;
		double var9 = 2e-3;
		System.out.println("var7: "+var7);
		System.out.println("var8: "+var8);
		System.out.println("var9: "+var9);
		
		//e 사용하기
		

	}

}
