package ch09_5Polymorphism;

public class Product {
	int price,bonusPoint;
	
	Product(int price){
		this.price = price;
		bonusPoint = (int)(price/10.0);
	}
}

class Buyer0{
	int money = 1000;
	int bonusPoint = 0;
	void buy(Product p) {
		if(money<p.price) {
			System.out.println("잔액 부족");
			return;
		}
		
		money -= p.price;
		bonusPoint += p.bonusPoint;
		System.out.println(p.toString()+"을/를 구입하셨습니다.");
	}
}

class Tv extends Product{
	Tv(){
		super(420);		//	Product의 자식 클래스의 super(int) -> Product 생성자인 Product("int" price)에 따라간다.
	}
	public String toString() {
		return "Tv";
	}
}
class Computer extends Product{
	Computer(){
		super(300);
	}
	public String toString() {
		return "Computer";
	}
}
class Audio extends Product{
	Audio(){
		super(40);
	}
	public String toString() {
		return "Audio";
	}
}
class PS5 extends Product{
	PS5(){
		super(120);
	}
	public String toString() {
		return "PS5";
	}
}