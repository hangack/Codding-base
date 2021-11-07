package Practice;

public class Card {
	int num = 1; boolean chk = true;
	
	Card() {
//		String info;
//		if(chk==true) {
//			info = String.valueOf(num)+'k';
//		}
//		else info = String.valueOf(num);
	}
	
	Card(int num, boolean chk) {
		this.num = num;
		this.chk = chk;
	}
	
	String info(){
		String a;
		if(chk==true) {
			a = String.valueOf(num)+'k';
		}
		else a = String.valueOf(num);
		return a;
	}

}
