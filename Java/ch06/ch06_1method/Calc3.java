package ch06_1method;

public class Calc3 {
	int sum(int[] v){
		int sum =0;
		for(int i=0;i<v.length;i++) sum+=v[i];
		return sum;
	}
	
	int sum2(int ...v) {
		int sum=0;
		for(int i=0;i<v.length;i++) sum+=v[i];
		return sum;
	}

}
