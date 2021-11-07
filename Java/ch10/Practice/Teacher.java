package Practice;

public class Teacher extends Member {
	String subject;
	Teacher(String subject){
		this.subject = subject;
	}
	public void work() {
		System.out.println("한다 강의");
	}
	public void test() {
		System.out.println("한다 채점");
	}

}
