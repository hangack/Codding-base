package Practice;

import java.util.Scanner;

public class Practice_08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		String title,artist,country,year;

		System.out.print("제목: ");
		title = scan.nextLine();
		System.out.print("가수: ");
		artist = scan.nextLine();
		System.out.print("연도: ");
		year = scan.nextLine();
		System.out.print("국가: ");
		country = scan.nextLine();
		
		Song song = new Song(title,artist,year,country);
		
		song.show();

	}

}
