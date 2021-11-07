package Practice;

public class Student extends Member {
	String subject;
	Student(String subject){
		this.subject = subject;
	}
	public void work() {
		System.out.println("한다 공부");
	}
	public void test() {
		System.out.println("친다 시험");
	}

}
