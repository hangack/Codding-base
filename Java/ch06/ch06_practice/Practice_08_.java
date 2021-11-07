package ch06_practice;

public class Practice_08_ {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {78,54,89,57,84},
			b[] = {95,74,91,84},
			c[];

		System.out.print('{');
		for(int i=0;i<add(a,b).length;i++) {
			System.out.print(add(a,b)[i]);
			if (i != add(a,b).length-1) System.out.print(',');
		}
		System.out.println('}');

		//	9.
		char no9[] = {'t','h','i','s',' ',
						'i','s',' ','a',' ',
					'p','e','n','c','i','l','.'};
		
		calc_p09 c9 = new calc_p09();
		for(int i =0;i<no9.length;i++)
			System.out.print(c9.comma(no9)[i]);
		
		
	}
//	private static int add2(int x[],int y[])[] {
//		int[] a = new int[] {1,2,3,4};
//		
//		return  a;
//	}
	
	private static int[] add(int x[],int y[]) {
		int l;
		if(x.length>y.length)
			l = x.length;
		else l = y.length;
		int z[] = new int[l];
		for(int i=0;i<l;i++) {
			if(i>=l-1) {
				if(l==x.length)	z[i] = x[i];
				else if(l==y.length) z[i] = y[i];
			} else z[i] = x[i]+y[i];
		}
		return z;
	}

}
