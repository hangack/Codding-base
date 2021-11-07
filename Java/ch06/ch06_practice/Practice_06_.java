package ch06_practice;

import java.util.Scanner;

public class Practice_06_ {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double score[] = new double[5];
		Scanner scan = new Scanner(System.in);
		
		System.out.printf("%d개의 수를 입력하세요: ",score.length);
		for(int i = 0;i<score.length;i++)	score[i]=scan.nextDouble();
		
		
		calc_p06 clac = new calc_p06();
		
//		double sum = clac.sum(score);
//		System.out.println(sum);
		System.out.println(clac.sum(score));
//		double avg = clac.avg(score);
//		System.out.println(avg);
		System.out.println(clac.avg(score));
		
		
		scan.close();
	}

}
