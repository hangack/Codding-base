package ch10_3Interface_Polymorphism;

class Driver {
	void drive(Vehicle select) {
		select.run();
	}
}

public class Polymorphism_2parameter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Driver driver = new Driver();
		Vehicle bus = new Bus();
		Vehicle taxi = new Taxi();
		driver.drive(bus);
		driver.drive(taxi);

	}

}
