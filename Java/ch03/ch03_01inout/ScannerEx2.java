package ch03_01inout;

import java.util.Scanner;

public class ScannerEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("이름, 폰, 나이, 날짜를 빈칸으로 분리하여 입력");
		Scanner scan = new Scanner(System.in);
		String name = scan.next();
		System.out.println("당신의 이름은 "+name+"입니다.");
		String phone = scan.next();
		System.out.println("당신의 번호는 "+phone+"입니다.");
		int age = scan.nextInt();
		System.out.println("당신의 나이는 "+age+"입니다.");
		int date = scan.nextInt();
		System.out.println("오늘은 "+date+"일 입니다.");
		scan.close();

	}

}
