package Practice;

public class Tire {
	int maxRoll,countRoll;
	String locate;
	Tire(){}
	Tire(String locate, int num){
		this.locate = locate;
	}
	
	boolean roll() {
		if(countRoll<maxRoll) {
			System.err.println(locate+"타이어수명: "+countRoll+"/"+maxRoll);
			countRoll++;
			return true;
		}else {
			System.out.println(locate+"타이어 교체 필요");
			return false;
		}
	}

}

class HankookTire extends Tire{
	
}

class KumhoTire extends Tire{
	
}
