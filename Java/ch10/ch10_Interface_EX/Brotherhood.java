package ch10_Interface_EX;

public class Brotherhood implements MyBrother {
	
	@Override
	public void playGame() {
		System.out.println("play game");
	}
	@Override
	public void playSports() {
		System.out.println("play sports");
	}
	@Override
	public void playChess() {
		System.out.println("play chess");
	}

}
