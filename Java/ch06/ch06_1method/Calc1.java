package ch06_1method;

public class Calc1 {
	void powerOn() {
		System.out.println("power on");
	}
	int plus(int x,int y) {
		int result = x+y;
		return result;
	}
	double divide(int x, int y) {
		double result = (double)x/(double)y;
		return result;
	}
	void powerOff() {
		System.out.println("power off");
	}
}
