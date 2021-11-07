package ch06_practice;

import java.util.Scanner;

public class Practice_01_ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 1~4.
		int n,n1,n2;
		Scanner scan = new Scanner(System.in);
		
//		System.out.print("특정 단 출력: ");
//		n = scan.nextInt();
//		times(n);
		
//		System.out.println("a~b 사이의 단을 출력");
		System.out.println("a~b 사이의 단을 출력합니다. 한 단만을 출력하려면 임의의 변수에 0을 입력하세요.");
		System.out.print("a: ");
		n1 = scan.nextInt();
		System.out.print("b: ");
		n2 = scan.nextInt();
		if(n1>n2) {	n=n1; n1=n2; n2=n;}
		
		switch (n1) {
		case 0:
			times(n2);		break;
		default:
			times(n1,n2);	break;
		}
		
		// 5.
		int num[] = {78,54,89,57,84,95,74
					,91,84,67,52,94,82};
		
		System.out.println(n = maxnum(num));
		
		
		scan.close();
	}

	// 1~4.
	private static void times(int a) {
		System.out.printf(" %1d단\n",a);
		for(int i=1;i<=9;i++)	System.out.printf("%1d * %1d = %2d\n",a,i,a*i);
	}
	private static void times(int a,int b) {
		for(int i=a;i<=b;i++) {
			System.out.printf(" %1d단\n",i);
			for(int j=1;j<=9;j++)
			System.out.printf("%1d * %1d = %2d\n",i,j,i*j);
		}
	}

	// 5.
	private static int maxnum(int num[]) {
		int max = 0;
		for(int i=0;i<num.length;i++) {
			if(max<num[i]) max=num[i];
		}return max;
	}

}
