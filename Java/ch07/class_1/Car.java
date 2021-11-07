package class_1;

public class Car {
// 클래스 선선: 접근제한자 class 클래스이름
	String color = "green";
	int speed = 0;
	
	public void forword() {
		speed++;
		System.out.println("기어올림");
	}
	
	public void backword() {
		speed--;
		System.out.println("기어내림");
	}


}


/*	[className] [변수];
	
  ->
*/