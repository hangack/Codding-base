package Practice;

import java.util.Scanner;

public class MonthSchedule {
	Scanner scan = new Scanner(System.in);
	String schedule=null;
	int menu=0,day;
	Day D[] = new Day[30];

	
	void input(){
		System.out.print("할일(빈칸 없이 입력): ");
		schedule = scan.next();
		D[day-1].set(schedule);
	}
	void view(){
		System.out.printf("%d일의 할 일은 ",day);
		D[day-1].show();
	}
	void finish(){
		System.out.println("프로그램을 종료합니다.");
	}
	void run(){
		for(int i =0;i<30;i++) {
			D[i] = new Day();
		}while(menu!=3){
			System.out.println("할일) 1.입력  2.보기  3.종료");
			menu = scan.nextInt();
			switch (menu) {
			case 1:
				System.out.print("날짜(1~30): ");
				this.day = scan.nextInt();
				input();
				break;
			case 2:
				System.out.print("날짜(1~30): ");
				day = scan.nextInt();
				view();
				break;
			case 3:
				finish();
				break;
			default:System.out.println("error");
				break;
			}
		}
	}

}
