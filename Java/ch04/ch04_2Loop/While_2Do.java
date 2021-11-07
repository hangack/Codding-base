package ch04_2Loop;

public class While_2Do {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i=0;
		do {
			i++;
			System.out.print(i+" ");
		} while(i<5);
		System.out.println();
		
		
		int isum=0;	i=0;
		do {
			i++;	isum+=i;
		} while(i<10);
		System.out.printf(" sum: %2d\n",isum);
		

		char alp='a';
		do {
			System.out.print(alp);
			alp++;
		} while (alp!='{');
	//	} while (a<='z');
		System.out.println();
		
		int alpha = (int)'a';
	//	System.out.println(alpha);
	//	System.out.println((int)'z');
	//	System.out.println((char)123);
		do {
			System.out.print((char)alpha);
			alpha++;
	//	} while ((char)alpha!='{');
		} while (alpha!=123);
	//	} while (alpha<=123);
		System.out.println();

	}

}
