package ch09_1Extends;

public class Parent03_AccessMod {
	public String lastName = "김";
	private String firstName = "유진";	//	private: 클래스 내에서 상속
	private void method() {
		System.out.println("부모클래스");
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	

}
