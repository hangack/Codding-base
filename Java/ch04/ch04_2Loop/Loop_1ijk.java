package ch04_2Loop;

public class Loop_1ijk {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i,j;
		for(i=1;i<9;) { i++;
			System.out.printf("%dtimes\n",i);
			for(j=1;j<=9;j++) {
				System.out.printf("%2d*%2d=%3d\n",i,j,i*j);
			}
		}
		
		
		int star=10;	i=0;j=0;
		for(i=0;i<star;) { i++;
			for(j=0;j<i;j++) {
				System.out.print('*');
			}
			System.out.println();
		}
		
	}

}
