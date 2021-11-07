package class_1;

public class Class_04initialization {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calc04 k1 = new Calc04("김태용", "960000-1000000");
		System.out.println("이름: "+k1.name);
		System.out.println("주민번호: "+k1.ssn);
		

		Calc04 k2 = new Calc04("이태용", "960000-1100000");
		System.out.println("이름: "+k2.name);
		System.out.println("주민번호: "+k2.ssn);
		

	}

}
