package ch09_5Polymorphism;

public class Polymorphism_1TypeConvert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child01 c1 = new Child01();
		Parent01 p1 = c1;		//	자동 타입 변환1
		
		Parent01 p2 = new Child01();		//	자동 타입 변환2
		
		c1.m1();	c1.m2();	c1.m3();	//	부모 메소드 m1 상속
		p1.m1();	p1.m2(); //	p1.m3();	//	자식으로부터 역상속 불가
		p2.m1();	p2.m2(); //	p2.m3();	//	Same
		
	}

}
