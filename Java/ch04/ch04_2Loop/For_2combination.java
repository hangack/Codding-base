package ch04_2Loop;

public class For_2combination {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i, i_sum=0;
		for (i=0;i<10;) {
			i++;	i_sum+=i;
			if (i<10)System.out.printf("%d+",i);
			else System.out.printf("%d=%d",i,i_sum);
		}
		System.out.println();
		
		
		int times=7,j,j_7num=0,j_7sum=0;
		for(j=0;j<100;) {
			j++;
			if(j%7==0)	{
				j_7num+=1;	j_7sum+=j;
			}
		}
		System.out.printf("%2dtimes num:%3d\n%2dtimes sum:%3d\n%2dtimes ave:%3d",times,j_7num,times,j_7sum,times,j_7sum/j_7num);
		System.out.println();

	}

}
