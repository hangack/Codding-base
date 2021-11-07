package ch06_1method;

public class Method_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calc6 car = new Calc6();
		int fuel = 5;
		car.SetGas(fuel);
		boolean LeftGas = car.isLeftGas();
		
//		while(true) {
//			car.run();
//			if (car.gas == 0) break;
//		}
//		car.isLeftGas();
//		System.out.println("need to refill the gas.");
		
//		for(int i = car.gas; i>0;) {
//			car.run();
//			if (car.gas == 0) break;
//		}
//		car.isLeftGas();
//		System.out.println("need to refill the gas.");
		
		if(LeftGas) {
			System.out.println("run");
			car.run();
		}
		if(car.isLeftGas()) {
			System.out.println("¡÷¿‘x");
		}
		else System.out.println("need to refill the gas.");
	
	}

}
