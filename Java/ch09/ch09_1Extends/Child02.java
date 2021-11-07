package ch09_1Extends;

public class Child02 extends Parent02 {
	int studnetNo;
	public Child02(String name, String ssn, int studentNo) {
		super(name,ssn);				//	super(매개값): 매개 값의 타입과 일치하는 부모 생성자를 호출
										//				> Parent02(String name, String ssn)
		this.studnetNo = studentNo;
	}

}
