package ch03_02Operator;

public class Practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//1. 가로3 세로6 사격형의 넓이
		int l = 6, w = 3, area_squ;
		System.out.println(area_squ = w*l);
		System.out.println();
		
		//2. 위 길이의 삼각형의 넓이
		double area_tri;
		System.out.println(area_tri = area_squ/2.);
		System.out.println();
		
		//3. 40,30,10의 평균
		int a=40,b=30,c=10,sum;
		double aver;
		sum =a+b+c;
		System.out.printf("%5.2f\n",aver=sum/3.);
		System.out.println();
		
		//4. 월급 100원일 때 연봉
		int pay_M = 100,pay_Y;
		System.out.println(pay_Y=pay_M*12);
		System.out.println();
		
		//5. 286을 몇분 몇초 형식으로 출력
		int time=286,min,sec;
		min=286/60; sec=286%60;
		System.out.printf("%2dm%2ds\n",min,sec);
		System.out.println();
		
		/*6. x=10,y=5 일 때 다음 결과를 출력
		 * 			(x>7)&&(y<=5)
		 * 		(x%3==0)||(y%2!=1)		*/
		int x=10,y=5;
		System.out.println((x>7)&&(y<=5));
		System.out.println((x%3==0)||(y%2!=1));
		System.out.println();
		
		//7. 534자루를 30명에게 같은 개수로 나눌 때 학생당 몇 개를 가질 수 있고 몇개가 남는지 구하시오.
		int pen=534, stu=30, ind_pen, remain;
		ind_pen = pen/stu;
		remain = pen%stu;
		System.out.printf("인당 %d개, 나머지 %d개\n",ind_pen,remain);
		System.out.println();
		
		//8. value 값이 356일 때, 300이 나올 수 있도록 코드를 작성하시오. (산술 연산자만 사용한다.)
		int value = 356;
		System.out.println(value/100*100);
		System.out.println();
		

	}

}
