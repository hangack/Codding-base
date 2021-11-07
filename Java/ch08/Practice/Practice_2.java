package Practice;

public class Practice_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Singleton s = Singleton.getInstance();
		
		s.setNumber(100);
		System.out.println(s.getNumber());

	}

}
