package ch10_Interface_EX;

public class Bus implements Ex04Vehiclable {
	private int speed;
	@Override
	public void run() {
		System.out.println("¹ö½º: "+this.speed+"Km");
	}
	@Override
	public void stop() {
		System.out.println("¹ö½º: ¸ØÃç!");
	}
	@Override
	public void setSpeed(int speed) {
		if(speed<0) {
			System.out.println("error: negative");
			return;
		}
		this.speed = speed;
	}

}
