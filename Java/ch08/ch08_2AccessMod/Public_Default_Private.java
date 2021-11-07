package ch08_2AccessMod;

public class Public_Default_Private {
	public String field1 = "public";
	String field2 = "default";
	private String field3 = "private";
	
	public void method1() {
		System.out.println("public");
	}
	void method2() {
		System.out.println("default");
	}
	private void method3() {
		System.out.println("private");
	}
	private void check() {
		System.out.println("public"+this.field1);
		System.out.println("default"+this.field2);
		System.out.println("private"+this.field3);
	}

}
