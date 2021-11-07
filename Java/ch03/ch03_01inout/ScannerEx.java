package ch03_01inout;

import java.util.Scanner;

public class ScannerEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		String inputdata;
		
		inputdata = scan.nextLine();	// 공백 포함 \n이 줄(Line)변경
		System.out.println("입력된 문자열: \""+inputdata+"\"");

		scan.close();

	}

}
