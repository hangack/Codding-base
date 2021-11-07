package ch05_practice;

import java.util.Scanner;

public class parctice10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*	배열을 사용해 학생 성적을 관리
		 * - 학생 5명 name[] = {"고길동","김길동","이길동","박길동","홍길동"};
		 * - 과목 3개 sub[] = {"국어","영어","수학"} -> 학생당 점수 3개 score[] = { , , }
		 * -1. 학생 이름으로 개개인의 성적을 조회
		 * -2. 전체 학생 성적을 과목별로 조회
		 * -3. 각 학생의 평균 성적으로 석차 조회
		 * 종료하지 않으면 메뉴가 반복적으로 출력 menu[] = {"성적입력","성적조회","석차조회","종료"}
		 * 성적 조회 시 개인별 성적조회 & 과목별 전체 성적조회
		 */
/*q
59 59 59
54 26 90
90 88 82
01 45 23
76 66 86
*/
		String name[] = {"고길동","김길동","이길동","박길동","홍길동"},
				sub[] = {"국어","영어","수학"},
				menu[] = {"종료","성적조회","석차조회","성적수정"};
		int score[][] = new int[name.length][sub.length],
			sum[] = new int[name.length],
			rank[] = new int[name.length];
		double avg[] = new double[name.length];
		
		Scanner scan = new Scanner(System.in);
		for(int i=0;i<name.length;i++) {
			
			System.out.print("\t");
			for(int j=0;j<sub.length;j++) {
				System.out.printf("%s ",sub[j]);
			}
			
			System.out.printf("\n%s:    ",name[i]);
			for(int j=0;j<sub.length;j++) {
				int s = scan.nextInt();
				score[i][j] = s;
			}
		}
		
		for(int i=0;i<name.length;i++) {
			sum[i]=0;
			for(int j=0;j<sub.length;j++) {
				sum[i]+=score[i][j];
			}
			avg[i] = (double)sum[i]/sub.length;
		}
		rank = new int[name.length];
		for(int i=0;i<name.length;i++){
			rank[i]++;
			for(int j=0;j<name.length;j++) {
				if(sum[i]<sum[j]) rank[i]++;
			}
		}
		
		
		while (true) {
			System.out.printf("\n1.%s 2.%s 3.%s 0.%s\n: ",menu[1],menu[2],menu[3],menu[0]);
			int a = scan.nextInt(), b;
			switch (a) {
			
			case 1:
				System.out.println("  성적조회");
				System.out.print("1. 개인성적  2.과목별 전체성적\n: ");
				b = scan.nextInt();
				if (b==1) {
					System.out.println("개인성적");
					for(int i=0;i<name.length;i++)	System.out.printf("%d.%s\t",i,name[i]);
					System.out.println(": ");
					b = scan.nextInt();
					System.out.print("\t");
					for(int i=0;i<sub.length;i++)	System.out.printf("%s\t",sub[i]);
					System.out.printf("\n%s\t",name[b]);
					for(int i=0;i<sub.length;i++)	System.out.printf("%2d\t",score[b][i]);
				}
				
				else if(b==2) {
					System.out.println("과목별 전체성적");
					for(int i=0;i<sub.length;i++)	System.out.printf("%d.%s\t",i,sub[i]);
					System.out.println(": ");
					b = scan.nextInt();
					System.out.printf("\t%s",sub[b]);
					for(int i=0;i<name.length;i++)	System.out.printf("\n%s\t%2d",name[i],score[i][b]);
					
				} else System.out.println("error");
				break;
				
			case 2:
				System.out.println("\t석차");
				for(int i=0;i<name.length;i++)	System.out.printf("%s\t%d\n",name[i],rank[i]);
				break;
				
			case 3:
				System.out.println("성적수정");
				for(int i=0;i<name.length;i++) {
					System.out.printf("%d.%s ",i,name[i]);
				}
				System.out.print("\n: ");
				b = scan.nextInt();
				System.out.printf("%s: ",name[b]);
				for(int i=0;i<sub.length;i++) {
					System.out.printf("%d.%s ",i,sub[i]);
				}
				System.out.print("\n: ");
				int c = scan.nextInt();
				System.out.printf("\'%s\' <%s>점수 변경: ",name[b],sub[c]);
				score[b][c] = scan.nextInt();
				
				sum[b]=0;								// 총합 수정
				for(int j=0;j<sub.length;j++) {
					sum[b]+=score[b][j];
				}
				avg[b] = (double)sum[b]/sub.length;		// 평균 수정
				
				rank = new int[name.length];			// 석차 수정
				for(int i=0;i<name.length;i++){
					rank[i]++;
					for(int j=0;j<name.length;j++) {
						if(sum[i]<sum[j]) rank[i]++;
					}
				}
				break;
				
			case 0:
				System.out.print("exit");break;
				
			default:
				System.out.println("error");break;
			}
			if (a==0) break;
		}
		

	}

}
