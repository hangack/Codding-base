package Practice;

public class Practice_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//	2-2
//		Student stu = new Student();
		Student stu = new Student("1",1,1,1,1,1);
		stu.name = "고길동";	stu.ban = 3;	stu.no = 17;
		stu.kor = 92;	stu.eng = 63;	stu.math = 74;
		System.out.println("이름: "+stu.name);
		System.out.println("총점: "+stu.getTotal());
		System.out.println("평균: "+stu.getAverage());
		System.out.println();
		
		
		//	2-3
		stu = new Student("고길동",3,17,92,63,74);
		stu.info();
		
	}

}
