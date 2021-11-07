package ch04_2Loop;

import java.util.Scanner;

public class Practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1. 1~100 sum
		int i,isum=0;
		for(i=1;i<=100;i++) isum +=i;
		System.out.printf("sum:%4d\n",isum);
		
		//2. 1~100 sum에서 sum>1000 일 때 break.
		i=0;isum=0;
		for(i=1;i<=100;i++) {
			isum +=i;
			if(isum>=1000) break;
		}
		System.out.printf("sum:%4d\n",isum);
		Scanner scan = new Scanner(System.in);
		//3. 로기인 기능 구현	id:	'grean',	pw: '123456'
		String IDs = "grean",PWs = "123456",id,pw;
		System.out.println("Id: ");
		id = scan.next();
		System.out.println("Pw: ");
		pw = scan.next();
		if (!(IDs.equals(id))) {
			System.out.println("error: ID mismatched");
		} 
		if (!(PWs.equals(pw))) {
			System.out.println("error: wrong PW");
		}
		else System.out.println("logged in");
//		if ((IDs.equals(id))&&(PWs.equals(pw))) {
//		System.out.println("logged in");
//		else System.out.println("error: ID or PW mismatched" );
		
		
		//4. 구구단 짝수단 출력
		int times;
		for(times=2;times<=9;times++) {
			if(times%2!=0) continue;
			System.out.printf("%dtimes\n",times);
			for(i=1;i<=9;i++) {
				System.out.printf("%2d*%2d=%3d\n",times,i,times*i);
			}
		}
		
		
		//5. 가위바위보
		int game = (int)(Math.random()*3),play = 1000;
		String com= " ",player;
		switch (game) {
		case 0: com = "가위"; break;
		case 1: com = "바위"; break;
		case 2: com = "보"; break;
		default: System.out.println("computer's error"); 
		}
		System.out.print("가위,바위,보: ");
		player = scan.next();
		switch (player) {
		case "가위": play = 0; break;
		case "바위": play = 1; break;
		case "보": play = 2; break;
		default: System.out.println("player's error");
		}
		System.out.printf("computer: %s\n",com);
		if (((play-game) == -1)||((play-game) == 2)) System.out.println("you lose");
		else if((play-game) == 0) System.out.println("draw");
		else if(((play-game) == 1)||((play-game) == -2))System.out.println("winner winner");
		
		
		/*6. 은행 예금 {예금 출금 잔액조회 종료}
		 * 	각 메뉴 선택시 해당 기능이 동작하도록 작성
		 *	 예금 선택시 입금 금액을 입력하면 "예금완료" 출력 후 다시 메뉴 호출
		 *	 출금 선택시 출금 금액을 입력하면 잔액과 비교해서 잔액보다 많은 금액 출금시 "잔액 부족"
		 *	잔액이 많은경우 "출금 완료" 메세지 출력 후 다시 메뉴 호출
		 *	 잔액조회 선택시 "잔고: \\\원" 출력 후 메뉴 호출
		 *	 종료 선택시: "프로그램 종료" 메세지 팝업 후 종료
		 *	 그외 메뉴 선택시 "error" 메세지 출력 후 다시 메뉴 호출
		 */
		String menu="대기";
		int money=0, account=100000;
//		while (!(menu.equals("종료"))) {
		while (true) {
			System.out.print("예금 출금 잔액조회 종료: ");
			menu=scan.next();
			if(menu.equals("예금")) {
				System.out.print("금액: ");
				money = scan.nextInt();
				account+=money; continue;
			}
			else if(menu.equals("출금")) {
				System.out.print("금액: ");
				money = scan.nextInt();
				if (money>account) {
					System.out.println("잔액 부족");
				}
				else {
					System.out.println("출금 완료");
					account -= money;	continue;
				}
			}
			else if(menu.equals("잔액조회")) {
				System.out.printf("잔고: %8d\n",account); continue;
			}
			else if(menu.equals("종료")) {
				System.out.println("프로그램 종료"); break;
			}
			else System.out.println("error: menu");
			
		}
		
		
		
		
		
		scan.close();
	}

}
