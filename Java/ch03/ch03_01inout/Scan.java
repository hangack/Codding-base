package ch03_01inout;

import java.util.Scanner; // ctrl+shift+O

public class Scan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		String name = scan.next();			// next: 공백 문자 사이를 읽음 (tab: \t,blank: '',line: \n(unix,window), \r(mac,window), page: \f)
		String city = scan.next();
		int age = scan.nextInt();
		double weight = scan.nextDouble();
		boolean single = scan.nextBoolean();
		
		System.out.println();

		scan.close();

	}

}
