package ch09_1Extends;

public class Child03 extends Parent03_AccessMod {
	private String id = "Child";
	
	public void m() {
		System.out.println(super.lastName);
//		System.out.println(super.firstName);	//	super 객체가 private라 불가능
		System.out.println(super.getFirstName());
	}

}
