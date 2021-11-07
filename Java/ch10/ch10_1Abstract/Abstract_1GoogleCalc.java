package ch10_1Abstract;

public class Abstract_1GoogleCalc extends Calculator {	//	상위 클래스에 abstract가 들어간 모든 메소드를 포함해야한다.
	public int add(int a, int b) {
		return a+b;
	}
	public int subtract(int a,int b){
		return a-b;
	}
	{
//	int subtract(int a,int b){		//	상위 클래스 접근 제한자 public보다 허위 클래스 접근제한자 default가 좁은 범위로 불가능하다.
//		return a-b;
//	}
	}
	double avg(int[] a) {
		double sum =0;
		for(int i=0;i<a.length;i++) {
			sum +=a[i];
		}
		return sum/a.length;
	}
	
	public static void main(String[] args) {
		Calculator c = new Abstract_1GoogleCalc();
		System.out.println(c.add(2, 3));
		System.out.println(c.subtract(2, 3));
		System.out.println(c.avg(new int[] {1,2,3,4,5}));
	}


}
