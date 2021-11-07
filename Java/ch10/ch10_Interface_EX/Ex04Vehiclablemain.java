package ch10_Interface_EX;

public class Ex04Vehiclablemain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Driver driver = new Driver();
		Bus bus = new Bus();
		Taxi taxi = new Taxi();
		
		bus.setSpeed(-50);
		bus.setSpeed(80);
		driver.drive(bus);
		driver.drive(taxi);
		
		System.out.println();
		
		driver.drive(new Taxi());
		driver.drive(new Bus());
		
		System.out.println();
		Ex04Vehiclable vehiclable = driver.newCarMethod(new Taxi());
		vehiclable.run();
		vehiclable.stop();
		
		System.out.println();
		vehiclable = driver.newCarMethod(new Bus());
		vehiclable.run();
		vehiclable.stop();

	}

}
