package Practice;

import java.util.Scanner;

public class Controller {
	void init(){
		Scanner sc = new Scanner(System.in);
		boolean loop=true;
		int menu;
		
		while(loop) {

			System.out.println("1. 회원가입  2. 로그인  3.종료\n:");
			menu = sc.nextInt();
			switch (menu) {
			case 1:
				
				break;

			case 2:
				
				break;

			case 0:
				loop = false;
				System.out.println("exit");
				break;

			default:
				System.out.println("error");
				break;
			}
		}
		
		
		sc.close();
	}

}
