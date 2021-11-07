package ch09_5Polymorphism;

public class Buyer2 {
	Product[] cart = new Product[3];
	int money = 10000,bonusPoint = 0;
	int i;

	
	public void buy(Product p) {
		if(money<=p.price) {
			System.out.println("잔액부족");
			return;
		}
		money -= p.price;
		bonusPoint += p.bonusPoint;
		System.out.println(p+" 구입");
		add(p);
	}
	
	public void add(Product p) {
		if(i<=cart.length) {
			Product[] temp = new Product[cart.length*2];
			System.arraycopy(cart,0,temp,0,cart.length);
			cart = temp;
		}
		cart[i++] = p;
		return;
	}
	
	void summary() {
		String itemList = "";
		int sum = 0;
		for(int i = 0;i < cart.length;i++) {
			if(cart[i]==null)	break;
			itemList += cart[i]+",";
			sum += cart[i].price;
		}
		System.out.println("구입한 물건: "+itemList);
		System.out.println("사용한 금액: "+sum);
		System.out.println("포인트: "+bonusPoint);
		System.out.println("남은 금액: "+money);
	}
}
