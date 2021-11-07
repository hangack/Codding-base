package test0915;

import java.util.Scanner;

public class No3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int menu,
			nseat = 7,
			count=0,price = 12000;
		int seat[] = new int[nseat];
		boolean exit=true;
		
		
		while(exit) {
			System.out.print("1. 좌석선택\t2. 종료\n: ");
			menu = scan.nextInt();
			if(menu==1) {
				
				for(int i=0;i<nseat;i++) {
					System.out.printf("%d. ",i);
					if (seat[i] == 1) 
						System.out.print("예매불가\t");
					else if (seat[i] == 0) 
						System.out.print("예매가능\t");
				}
				
				System.out.print("\n: ");
				int check = scan.nextInt();
				if(check>=nseat)
					System.out.println("seat num error");
				else if(check<nseat) {
					if(seat[check] == 1)
						System.out.println("예매 불가");
					else {
						seat[check] = 1;
						count++;
						System.out.printf("%d번 좌석 예매완료\n",check);
					}
				}
			}
			
			if(menu==2) {
				System.out.println("종료");
				exit = false;
			}
		}
		System.out.printf("매출: %d\n",price*count);
		

	}

}
