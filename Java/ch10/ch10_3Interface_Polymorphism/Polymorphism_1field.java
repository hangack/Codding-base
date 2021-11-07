package ch10_3Interface_Polymorphism;

public class Polymorphism_1field {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car car1 = new Car();
		car1.run();

		car1.fL = new Kumho();
		car1.bR = new Kumho();
		System.out.println();
		car1.run();

	}

}
