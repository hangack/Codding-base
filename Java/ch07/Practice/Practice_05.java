package Practice;

public class Practice_05 {
	static String[] account = new String[3];

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int menu, task;
		boolean tf = true;
		Account ac = new Account();
		
		while(tf) {
			System.out.print("1.계좌생성  2.입출금   0.종료\n: ");
			menu = ac.scan.nextInt();
			
			if(menu == 0) {
				System.out.println("종료");
				tf = false;
			}
				
			else if(menu == 1) {
				System.out.print("예금주: ");
				account[0] = ac.scan.next();
				System.out.print("계좌번호: ");
				account[1] = ac.scan.next();
				System.out.print("예금액: ");
				account[2] = ac.scan.next();
				ac.user(account[0], account[1], Integer.parseInt(account[2]));
			}
			
			else if(menu == 2) {
				System.out.print("계좌번호입력: ");
				if(ac.scan.next().equals(account[1])){
					System.out.print("1.입금\t2.출금\t3.잔액조회\n: ");
				
					task = ac.scan.nextInt();
					if (task == 1) {
						ac.deposit();
					}
					else if(task == 2) {
						ac.withdraw();
					}
					else if(task == 3) {
						System.out.println("잔고: "+ac.balance);
					}else System.out.println("error");
				
				}else System.out.println("error");
			}else System.out.println("미등록 계좌");
		}
		ac.scan.close();
	}

}
