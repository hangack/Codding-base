package ch04_2Loop;

public class For_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.out.print("i: ");
		for (int i=0;i<=5;++i) System.out.printf("%d ",i);
		System.out.println();
		
		System.out.print("j: ");
		for (int j=0;j<=5;j++) {
			System.out.printf("%d ",j);
		}
		System.out.println();

		System.out.print("k: ");
		for (int k=0;k<=5;) {
			++k;
			System.out.printf("%d ",k);
		}
		System.out.println();

		int a_sum=0;
		for (int a=0;a<10;) {
			a++;
			a_sum+=a;
		}
		System.out.printf("합계: %d",a_sum);
		System.out.println();
		
		int b_sum=0;
		for (int b=1;b<=10;b++) {
			b_sum+=b;
		}
		System.out.printf("합계: %d",b_sum);
		System.out.println();
		
		int main=2,c;
		System.out.printf("%d단\n",main);
		for(c=1;c<10;c++)
			System.out.printf("%d*%d=%2d\n",main,c,main*c);
			
	}

}
