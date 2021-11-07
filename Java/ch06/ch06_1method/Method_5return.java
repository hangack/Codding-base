package ch06_1method;

import java.util.Scanner;

public class Method_5return {
	
	public static int maxnum(int a, int b) {
		int max;
		if (a>b) max = a;
		else max = b;
		return max;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a, b;
		System.out.println("2개의 수를 입력");
		System.out.print('>');	a = sc.nextInt();
		System.out.print('>');	b = sc.nextInt();
		System.out.printf("maxnum: %d",maxnum(a, b));

	}
	

}
