package ch04_1Conditional;

import java.util.Scanner;

public class Switch_scan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("과목");
		System.out.println("1.수학 2.과학 3.영어 4.역사");
		System.out.println("과목번호: ");
		int num = sc.nextInt();
		
		switch(num){
			case 1: System.out.println("101호"); break;
			case 2:System.out.println("102호");break;
			case 3:System.out.println("203호"); break;
			case 4: System.out.println("204호");break;
			default: System.out.println("상담원에게 문의 해주세요");
		}

	}

}
