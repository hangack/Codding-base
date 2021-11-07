package test0928;


public class Student {

	public static void main(String[] args) {
		
		Student stu;
		stu = new Student(null, 0, 0, 1, 2, 5);
		
		stu.info();
	}
	
	
	
	String name;
	int ban,no,kor,eng,math,sum;
	double avg;
	
	
	Student(String name, int ban, int no,
			int kor, int eng, int math){
		this.name = name;	this.ban = ban;		this.no = no;
		this.kor = kor;		this.eng = eng;		this.math = math;
	}
	
	int getTotal(){
		sum = this.kor+this.eng+this.math;
		return sum;
	}
	
	double gatAverage() {
		avg = sum/3.;
		return avg;
	}
	
	public void info() {
		System.out.println("이름: "+name);
		System.out.println("반: "+ban);
		System.out.println("번호: "+no);
		System.out.println("국어점수: "+kor);
		System.out.println("영어점수: "+eng);
		System.out.println("수학점수: "+math);
		System.out.println("총점: "+getTotal());
		System.out.println("평균: "+gatAverage());
	}
}
