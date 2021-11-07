package ch09_5Polymorphism;

public class Polymorphism_5Casting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		People man = new Man();
		People woman = new Woman();
		
		man.printInfo();
//		man.enlist();			//	People 타입에는 enlist 메소드가 없다.
		((Man)man).enlist();	//	Man 타입으로 강제 변환(casting)
		System.out.println();
		woman.printInfo();
		((Woman)woman).working();

	}

}
