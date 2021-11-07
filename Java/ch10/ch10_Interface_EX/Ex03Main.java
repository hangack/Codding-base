package ch10_Interface_EX;

public class Ex03Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Brotherhood bro1 = new Brotherhood();
		bro1.playGame();
		bro1.playSports();
		bro1.playChess();
		System.out.println("----------------------------");
		Brotherhood bro2 = new Brotherhood();
		bro2.playGame();
		System.out.println("----------------------------");
		Brotherhood bro3 = new Brotherhood();
		bro3.playSports();
		System.out.println("----------------------------");
		Brotherhood bro4 = new Brotherhood();
		bro4.playGame();
		bro4.playSports();
		bro4.playChess();
	}

}
