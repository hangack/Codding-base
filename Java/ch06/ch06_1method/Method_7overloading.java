package ch06_1method;

public class Method_7overloading {
/*	이름이 같은 매소드를 여러개 설정할 수 있다.
 * 	매개변수 개수 혹은 타입이 다를 때 같은 이름의 메소드 중 해당하는 매소드를 찾아간다.
 *	리턴타입은 자동변환된다.
 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub\
//		System.out.printf("int형 +: %d\n",add(3,5));
//		System.out.printf("double형 +: %4.2f\n",add(3.14,5.78));
		System.out.println("정수 + 정수 = "+add(5,7));
		System.out.println("실수 + 실수 = "+add(2.2,8));
		System.out.println("정수 + 실수 = "+add(30,5.5));
		

		info("고길동");
		info("고길동",25);
		info("asdf","1234");
		info(123,"코드 컴플리트");

	}

	public static int add(int a, int b) {
		return a+b;	}
	public static double add(double a, double b) {
		return a+b;	}
	public static double add(int a, double b) {
		return a+b;	}

	private static void info(String name) {
		System.out.println("name: "+name);	}
	private static void info(String name, int age) {
		System.out.println("name: "+name);
		System.out.println("age: "+age);	}
	private static void info(String id, String pw) {
		System.out.println("ID: "+id);
		System.out.println("PW: "+pw);	}
	private static void info(int number, String title) {
		System.out.println("num: "+number);
		System.out.println("title: "+title);	}

}
