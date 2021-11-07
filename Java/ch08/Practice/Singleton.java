package Practice;

public class Singleton {
	private Singleton() {}
	
	private int number;
	
	private static Singleton s = new Singleton();
	static Singleton getInstance() {
		return s;
	}
	
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}

}
