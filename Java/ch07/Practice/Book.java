package Practice;

import java.util.Scanner;

public class Book {
	String book = "아프면 병원가라."
			,author;
	Scanner scan = new Scanner(System.in);

	void In() {
		System.out.print("제목>>");
		book = scan.nextLine();
		System.out.print("저자>>");
		author = scan.nextLine();
	}
	void info(){
			System.out.printf("(%s, %s)",book,author);
		
	}
}
