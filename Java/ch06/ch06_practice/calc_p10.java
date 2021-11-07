package ch06_practice;

import java.util.Scanner;

public class calc_p10 {
	int account;
	Scanner scan = new Scanner(System.in);
	
	void in(){
		int money = scan.nextInt();
		double max = 1e6;
		if(account+money>max) {
			System.out.printf("error: \\%.0f 이상은 입금할 수 없습니다.\n",max);
		}
		else account +=money;
	}
	
	
	void out(){
		int money = scan.nextInt();
		account -=money;
	}
	
	
	void check(){
		System.out.printf("잔액: %d\n",account);
	}
	
}
