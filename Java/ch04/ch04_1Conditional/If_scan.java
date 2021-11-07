package ch04_1Conditional;

import java.util.Scanner;

public class If_scan {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("임의의 숫자 입력: ");
		int number = sc.nextInt();

		if (number > 0)
			System.out.println("양수");
		else if (number == 0)
			System.out.println("0");
		else
			System.out.println("음수");

		System.out.println();
	}

}
