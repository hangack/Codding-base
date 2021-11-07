package ch09_5Polymorphism;

public class Polymorphism_7Parameter {
	public static void func(People people) {	//	인스턴스를 함수 형태로 설정
		people.printInfo();
		if(people instanceof Man) {
			((Man)people).enlist();
		}
		if(people instanceof Woman) {
			((Woman)people).working();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		People man = new Man();
		People woman = new Woman();
		func(man);
		
		System.out.println();
		func(woman);
;
	}

}
