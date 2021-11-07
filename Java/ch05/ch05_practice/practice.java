package ch05_practice;

import java.util.Scanner;

public class practice {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		1. arr[3].length의 값
		int arr2[][] = {{5,5,5,5,5},{10,10,10},{20,20,20,20},{30,30}};
		System.out.println(arr2[3].length);
//		System.out.println(arr2.length);
		
		
//		2. 배열에 담긴 값들의 합
		int arr1[] = new int[] {10,15,47,23,51};
		int sum2=0;
		for(int i:arr1) sum2+=i;
		System.out.println(sum2); 
		
		
//		3. 2차원 배열에 담긴 모든 값들의 총합과 평균을 구하는 프로그램
		arr2 = new int[][] {{ 5, 5, 5, 5, 5},{10,10,10,10,10},
							{20,20,20,20,20},{30,30,30,30,30}};
		int sum3=0;
		for(int i=0;i<arr2.length;i++) {
			for(int j=0;j<arr2[i].length;j++) {
				sum3+=arr2[i][j];
			}
		}
		System.out.println(sum3);
		
		
//		4. 1~9의 숫자로 이루어진 3자리 숫자를 만들어 내는 프로그램. 단, 숫자의 중복이 있어선 안된다.
		arr1 = new int[3];
//		for(int i:arr1) {
//			for(int j:arr1) {
//				for(int k:arr1) {
//					if((i!=j)&&(i!=k)&&(j!=k)) System.out.printf("%d%d%d ",i,j,k);
		int a = (int)(Math.random()*9+1);
		arr1[0]=a;
		while(a==arr1[0]) {
			a = (int)(Math.random()*9+1);
		}
		arr1[1]=a;
		while((a==arr1[0])||(a==arr1[1])) {
			a = (int)(Math.random()*9+1);
		}
		arr1[2]= a;
		for(int i=0;i<=2;i++)	System.out.print(arr1[i]);
		System.out.println();
		
		
//		5. 최대값에 해당하는 index를 출력
		arr1 = new int[] {78,54,89,57,84,95,74,91,84,67,52,94,82};
		int max5=arr1[0];
		for (int i=0;i<arr1.length;i++) {
			if(max5>arr1[i]) max5=arr1[i];
		}
		System.out.println(max5);
		
		
//		6.배열의 반복문을 이용하여 프로그램을 작성
//		-1. 키보드에서 정수로 된 동의 액수를 입력받아 오만원/만원/천원/500원/100원/50원/10원/1원짜리가 각 몇개로 변환되는지 출력하세요.
		Scanner scan = new Scanner(System.in);
		System.out.print("현금 투입: ");
		int money = scan.nextInt(), 
				change[] = new int[8], 
				paper[] = {50000,10000,1000,500,100,50,10,1};
		String bill[] = {"50000","10000","1000","500","100","50","10","1"};
		for(int i=0;i<change.length;i++) {
			change[i] = money/paper[i];
			money -= change[i]*paper[i];
			System.out.printf("%s원권 %d개 ",bill[i],change[i]);
		}System.out.println();
		
		
//		7. 배열에 담긴 숫자를 읽어서 숫자만큼 *을 찍는 프로그램
		arr1 = new int[]{3,2,5};
		for(int i=0;i<arr1.length;i++) {
			for(int n=arr1[i];n>0;n--) {
				System.out.print('*');
			}System.out.println();
		}
		
		
//		8. a와 b를 번갈아 c에 저장
		int a8[]= {10,20,30}, b8[] = {40,50,60}, c8[] = new int[a8.length+b8.length];
		char num[] = {'0','1','2','3','4','5'};
		for(int i=0;i<(a8.length+b8.length);i++) {
			switch (i%2) {
			case 0: {
				c8[i] = a8[i/2];
				System.out.printf("%c번 주소: %d	",num[i],c8[i]); continue;
			}
			case 1: {
				c8[i] = b8[(i-1)/2];
				System.out.printf("%c번 주소: %d	",num[i],c8[i]); continue;
			}
			}
		}
		
		
//		9. 영화관 좌석예매(좌석 수: 7개)
		/*	사용자로부터 좌석번호(index)를 입력 받아 예매하는 시스템.
		 *	예매가 완료되면 해당 좌석 값을 1로 변경
		 *	이미 예매가 완료된 좌석은 재구매할 수 없다.
		 *	한 좌석당 예매 가격은 12,000원이다.
		 *	프로그램 종료 후, 해당 영화관의 총 매출액을 출력한다.
		 */
		int nseat=7, a9, price = 12000;
		int seat[] = new int[nseat];
		String cseat[] = new String[nseat];
		for(int i=0;i<nseat;i++) cseat[i] = "예매가능";
//		String cseat[] = {"예매가능","예매가능","예매가능","예매가능","예매가능","예매가능","예매가능"};
		while(true) {
			System.out.printf("좌석 현황\n");
			for(int i=0;i<seat.length;i++) {
				System.out.printf("%d번: %s	",i+1,cseat[i]);
				if (i==4) System.out.println();
			}
			System.out.printf("\n좌석 선택: ");;
			a9 = scan.nextInt()-1;
			
			if(seat[a9] != 1) {
				seat[a9] = 1;
				cseat[a9] = "예매불가";
				System.out.printf("좌석%d 예매완료\n",a9+1);
			}
			else System.out.println(cseat[a9]);
			System.out.println("1. 계속\n0. 종료");
			int quit = scan.nextInt();
			if (quit == 0) break;
		}
		
		int count = 0;
		for(int i=0;i<seat.length;i++) {
			if(seat[i]!=0) count++;
		}System.out.printf("금일 매출: %d,000",price*count/1000);
		
		
		
		scan.close();
	}

}
