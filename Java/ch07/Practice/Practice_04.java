package Practice;

public class Practice_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book[] book = new Book[2];
		for(int i=0;i<2;i++) {
			book[i] = new Book();
			book[i].In();
		}
		for(int i=0;i<2;i++) {
			book[i].info();
		}
		
	}

}
