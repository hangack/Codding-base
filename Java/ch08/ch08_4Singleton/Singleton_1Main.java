package ch08_4Singleton;

public class Singleton_1Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Calc1 s = new Calc1();			//	private라 접근 불가
		Calc1 s = Calc1.getInstance();
		
		s.setField("Hi");
		
		System.out.println(s.getField());
		Calc1 s2 = Calc1.getInstance();
		System.out.println(s2.getField());

	}

}
