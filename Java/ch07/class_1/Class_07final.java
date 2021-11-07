package class_1;

public class Class_07final {
	final static String constant = "상수";
	final String NAME = "안녕하세요";

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(constant);
		System.out.println(Class_07final.constant);
//		System.out.println(NAME);		//	static이 없다.
//		System.out.println(Class_07final.NAME);
		Class_07final fm = new Class_07final();
//		fm.NAME = "반갑습니다";			//	final: 저장값 변경 불가
//		Class_07final.constant = "변경 불가"
		System.out.println(fm.NAME);

	}

}
