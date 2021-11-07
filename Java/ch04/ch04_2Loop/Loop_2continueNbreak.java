package ch04_2Loop;

import java.util.Scanner;

public class Loop_2continueNbreak {

	public static void main(String[] args) {
		
		System.out.println("regular for");
		int cnt;
		for(cnt=1;cnt<=5;cnt++) System.out.println("cnt: "+cnt);
		
		System.out.println("break;");
		for(cnt=1;cnt<=5;cnt++) {
			if(cnt==3) break;
			System.out.println("cnt: "+cnt);
		}
		
		System.out.println("continue;");
		for(cnt=1;cnt<=5;cnt++) {
			if(cnt==3) continue;
			System.out.println("cnt: "+cnt);
		}
		
		
		Scanner scan = new Scanner(System.in);
		int i,a,asum=0;
		System.out.print("enter 5 integers(add only possitive): ");
		for(i=0;i<5;i++) {
			a = scan.nextInt();
			if (a<0) continue;
			asum += a;
		} System.out.printf("sum:%5d\n",asum);
		
		
		
		
		scan.close();
	}
}
