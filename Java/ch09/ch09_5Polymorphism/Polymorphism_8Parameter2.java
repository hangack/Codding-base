package ch09_5Polymorphism;

public class Polymorphism_8Parameter2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Buyer0 order = new Buyer0();
		Product tv = new Tv();
		Product com = new Computer();
		Product aud = new Audio();
		order.buy(tv);
		order.buy(com);
		
		System.out.printf("잔액: %d\n포인트: %d",order.money,order.bonusPoint);

	}

}
 