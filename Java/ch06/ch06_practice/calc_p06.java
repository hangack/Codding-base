package ch06_practice;

public class calc_p06 {
	double sum=0;
	double sum(double s[]) {
		for(int i=0;i<s.length;i++)	sum += s[i];
		return sum;
		
	}
	double avg(double s[]) {
		int count = 0;
		for(int i=0;i<s.length;i++) count++;
		double avg = sum/ count;
		return avg;
	}
	
	
}
