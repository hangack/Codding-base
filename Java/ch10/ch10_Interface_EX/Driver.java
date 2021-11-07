package ch10_Interface_EX;

public class Driver {
	public void drive(Ex04Vehiclable Vehiclable) {
		Vehiclable.run();
	}
	public void stop(Ex04Vehiclable vehiclable) {
		vehiclable.stop();
	}
	
	public Ex04Vehiclable newCarMethod(Ex04Vehiclable vehiclable) {
		if(vehiclable instanceof Taxi) {
			Taxi taxi = (Taxi)vehiclable;
			return taxi;
		}
		else if(vehiclable instanceof Bus) {
			Bus bus = (Bus) vehiclable;
			return bus;
		}
		
		return null;
	}

}
