package ch09_4OverRIde;

public class OverRide_2Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child02 child = new Child02();
		child.takeOff();
		child.fly();
		child.flyMode=child.SUPERSONIC;
		child.fly();
		child.flyMode=child.NORMAL;
		child.fly();
		child.land();

	}

}
