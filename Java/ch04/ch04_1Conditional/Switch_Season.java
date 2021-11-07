package ch04_1Conditional;

import java.util.Scanner;

public class Switch_Season {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		System.out.print("월(1~12)을 입력하시오: ");
		Scanner scan = new Scanner(System.in);
		int month=scan.nextInt();
		
		switch(month) {
		case 3:		case 4:		case 5:
			System.out.println("봄");
			
			break;
			
		case 6:		case 7:		case 8:
			System.out.println("여름");
			break;
			
		case 9:		case 10:	case 11:
			System.out.println("가을");
			break;
			
		case 12:	case 1:		case 2:
			System.out.println("겨울");
			break;
			
		default: System.out.println("N/A");
		
		}		scan.close();

	}

}
