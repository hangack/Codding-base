package ch06_1method;

public class Method_3array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int values[] = {1,2,3,4};
		int sum = sum(values);
		System.out.printf("main sum: %d\n",sum);
		
		Calc3 com = new Calc3();
		values = new int[] {1,2,3};
		int result = com.sum(values);
		System.out.println("sum1-1: "+result);
		
		result = com.sum(new int[] {1,2,3,4,5});
		System.out.println("sum1-2: "+result);
		
		result = com.sum2(values);
		System.out.println("sum2-1: "+result);
		
		result = com.sum2(1,2,3,4,5);
		System.out.println("sum2-2: "+result);
				
	}
	private static int sum(int v[]) {
		int sum = 0;
		for(int i = 0;i<v.length;i++) sum+=v[i];
		System.out.printf("method sum: %d\n",sum);
		return sum;
	}

}
