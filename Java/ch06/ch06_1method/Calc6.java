package ch06_1method;

public class Calc6 {
	int gas;	//	전역 변수
	
	void SetGas(int gas) {
		this.gas = gas;
	}
	boolean isLeftGas() {
		if(gas==0) {
			System.out.println("GAS empty");
			return false;
		}
		else System.out.println("GAS remain");
			return true;
		
	
	}
	void run() {
		while(true) {
			if (gas>0) {
				System.out.println("remain: "+gas);
				gas-=1;
			}
			else {
				System.out.println("STOP! remain: "+gas);
				return;
			}
		}
	}

}
