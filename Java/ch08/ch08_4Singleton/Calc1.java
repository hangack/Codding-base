package ch08_4Singleton;

public class Calc1 {
	private Calc1() {}
	private static Calc1 s = new Calc1();
	public static Calc1 getInstance() {		//	static으로 선언됐기 때문에 Singleton 클래스를 이용할 수 있다.
		if (s==null) {			//	if문 없어도 상관 없음
			s = new Calc1();
		}
		return s;
	}
	
	
	private String field;
	public String getField() {
		return field;
	}
	public void setField(String field) {
		this.field = field;
	}

}
