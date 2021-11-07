package ch06_1method;

import java.util.Scanner;

public class Method_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("숫자를 두개 입력");
		System.out.print(">");
		int ai = scan.nextInt();
		System.out.print(">");
		int bi = scan.nextInt();
		
		maxNum(ai,bi);

	}
	public static void maxNum(int a,int b) {
		int max;
		if(a>b) max = a;
		else max = b;
		System.out.printf("%d 와 %d 중에 큰 수: %d",a,b,max);
	}

}
