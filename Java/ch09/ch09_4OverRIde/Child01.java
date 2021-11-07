package ch09_4OverRIde;

public class Child01 extends Parent01 {
	int age = 25;
	@Override		//	어노테이션: 오버라이딩이 잘 되었는지 체크하는 구문 (필요하진 않음)
	public void info() {	//	메소드 오버라이딩 -> 부모&자식 메소드일 경우 자식 메소드가 우선
		//	오버라이딩 시 접근 제한자의 확장은 가능하나 축소는 불가능하다.	(ex: P= public, C= (defualt)  는 불가능)
//		System.out.println("자식객체 info() 이름: "+this.name);		//	부모 클래스의 객체를 상속
		super.info();											//	부모 클래스의 info 메소드를 불러왔다.
		System.out.println("자식객체 info() 나이: "+this.age);
	}

}
