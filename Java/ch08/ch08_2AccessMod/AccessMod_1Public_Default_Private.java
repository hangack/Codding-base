package ch08_2AccessMod;

import ch08_2AccessMod.dto.TestDto;
//import ch08_2AccessMod.vo.TestVo;		
//	default 접근제한자는 같은 패키지 안에서만 사용 가능하다.
//	현재패키지: ch08_AccessMod;
//	생성자 제한자는 기본적으로 class를 따라간다.

//	public > protected > (default) > private

public class AccessMod_1Public_Default_Private {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TestDto testdto = new TestDto();
//		testVo testvo = new TestVo();
		
		ch08_2AccessMod.Public_Default_Private ex1 = new ch08_2AccessMod.Public_Default_Private();
		//	동일 패키지
		ch08_2AccessMod.dto.DTO_Public_Default_Private ex2 = new ch08_2AccessMod.dto.DTO_Public_Default_Private();
		//	동일 프로젝트

		System.out.println("public"+ex1.field1);	//public:	프로젝트 안에서 사용
		System.out.println("public"+ex1.field2);	//default:	동패키지 안에서 사용
//		System.out.println("public"+ex1.field3);	//private:	동클래스 안에서 사용
		
		ex1.method1();
		ex1.method2();
//		ex1.method3();
		
		System.out.println("public"+ex2.field1);	//public:	프로젝트 안에서 사용
//		System.out.println("public"+ex2.field2);	//default:	동패키지 안에서 사용
//		System.out.println("public"+ex2.field3);	//private:	동클래스 안에서 사용
		
		ex2.method1();
//		ex2.method2();
//		ex2.method3();

	}

}
