package ch04_1Conditional;

public class If2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int score = 65;
		if (score >= 90)
			System.out.println("A");
		else if (score >= 80)
			System.out.println("B");
		else if (score >= 70)
			System.out.println("C");
		else
			System.out.println("D");
		System.out.println();

		int age = 38;
		if (age >= 60)
			System.out.println("노약자 무료");
		else if (age >= 20)
			System.out.println("성인");
		else if (age >= 13)
			System.out.println("청소년");
		else if (age >= 8)
			System.out.println("어린이");
		else
			System.out.println("유아 무료");
		System.out.println("프로그램 종료");
		System.out.println();

	}

}
