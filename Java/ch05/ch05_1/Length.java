package ch05_1;

public class Length {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] scores = {83,90,87};
		
		int sum=0;
		for(int i=0;i<scores.length;i++) {		//scores.length = 3
			sum+=scores[i];
		}
		System.out.printf("sum: %d\n",sum);
		System.out.printf("avg: %f\n",(double)sum/scores.length);
			
			
	}

}
