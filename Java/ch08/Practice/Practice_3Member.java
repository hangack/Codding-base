package Practice;

import java.util.Scanner;

public class Practice_3Member {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		Member m[] = new Member[100];
		for(int i=0;i<m.length;i++) {
			m[i] = new Member();
		}
		
		boolean tf=true;
		int menu;
		
		while(tf) {
			System.out.println("1. Sign in\n2. Creat Account\n0. Exit");;
			menu = scan.nextInt();
			switch (menu) {
			case 0:
				tf = false;
				break;
			case 1:
				String ckid,ckpw;
				System.out.print("ID: ");
				ckid = scan.next();
				System.out.print("PW: ");
				ckpw = scan.next();
				for(int i=0;i<m.length;i++) {
					if(m[i].getId().equals(ckid)) {
						if(m[i].getPwd().equals(ckpw)) {
							m[i].prt();
							break;
						}else {
							System.out.println("PW를 다시 확인해주세요");
							break;
						}
					}else if((i == m.length-1) && !(m[i].getId().equals(ckid))) System.out.println("등록된 아이디가 없습니다");
				}
				break;
			case 2:
				for(int i=0;i<m.length;i++) {
					if(m[i].getId() == null) {
						String name,id,pwd,phone;
						System.out.print("id: ");
						id = scan.next();
						System.out.print("pw: ");
						pwd = scan.next();
						System.out.print("name: ");
						scan.nextLine();				//	이전 Enter로 Line이 입력되기 때문에
						name = scan.nextLine();
						System.out.print("phone: ");
						phone = scan.next();
						m[i] = new Member(name,id,pwd,phone);
						break;
					}
				}
				break;

			default:
				System.out.println("error");
				break;
			}
		}System.out.println("Exit");

		scan.close();
	}

}
