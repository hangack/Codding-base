package ch04_1Conditional;

public class Switch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String lang = "Java";
		switch (lang) {	//특정 조건을 찾아 해당 행으로 이동
		case "Python":	//문자, 정수, 문자열 사용 가능; 실수, 수식은 사용 불가
			System.out.println("파이썬");
			// break;
		case "Java": // 특정 값인 Java부터 코드 시작.
			System.out.println("자바");
			// break; //break문이 없으면 이후 모든 코드가 작동한다.
		case "C#":
			System.out.println("C#");
			// break;
		case "C++":
			System.out.println("Cpp");
			// break;
		default:
			System.out.println("기타 언어");
		}
		System.out.println();

		char grade = 'B';
		
		switch(grade) {
		case 'A':
		case'a':
			System.out.println("우수회원");
			break;
		case'B':
		case 'b':
			System.out.println("일반회원");
			break;
		default:
			System.out.println("손님");
		}
	
	}

}
