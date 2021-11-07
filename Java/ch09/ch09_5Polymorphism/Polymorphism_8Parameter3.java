package ch09_5Polymorphism;

public class Polymorphism_8Parameter3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Buyer2 order = new Buyer2();

		order.buy(new Audio());
		order.buy(new Tv());
		order.buy(new Computer());
		order.buy(new Tv());
		order.buy(new Audio());
		order.buy(new PS5());
		order.buy(new Computer());
		order.summary();;

	}

}
