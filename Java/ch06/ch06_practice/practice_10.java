package ch06_practice;

import java.util.Scanner;

public class practice_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		calc_p10 bank = new calc_p10();
		int account,money,menu;
		account = 210000;
		boolean input=true;
		
		bank.account = account;
		while(input) {
			System.out.printf("1.예금 2.출금 3.조회 0.종료\n: ");
			menu = scan.nextInt();
			switch (menu) {
			case 1:
				System.out.print("금액 투입: ");
				bank.in();
				bank.check();
				continue;
			case 2:
				System.out.print("찾으실 금액: ");
				bank.out();
				bank.check();
				continue;
			case 3:
				bank.check();
				continue;
			case 0:
				input =false;
				continue;

			default:System.out.println("error");
				continue;
			}
			
		}
		System.out.println("프로그램을 종료합니다.");

		
		scan.close();
		bank.scan.close();
	}

}
