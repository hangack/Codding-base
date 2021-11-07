package ch05_1;

public class Metrix_2for {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int score[][] = {{22,55},{77,66},{57,80},{92,84}},num= 0,sum= 0;
		for (int i=0 ;i<score.length;i++) {
			for (int j=0 ;j<score[i].length;j++) {
				sum += score[i][j];
				num++;
			}
		}
		System.out.printf("avg 4y: %5.2f\n",(double)sum/num);
		
		
		int[] nums = {78,85,80,67,92,61};
		int nsum = 0;
		for(int n:nums) {
			System.out.print(n+" ");
			nsum+=n;
		}
		System.out.printf("향상된 for문 합계: %d\n",nsum);
		
		
		String str[] = {"자바","C","파이썬","C++","C#"};
		String S=null;
		for(String i:str) {
			System.out.printf("%s ",i);
		}System.out.println();
		
		
	}

}
