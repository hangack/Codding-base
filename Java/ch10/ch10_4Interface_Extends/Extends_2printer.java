package ch10_4Interface_Extends;

public class Extends_2printer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SamgungPrint samsung = new SamgungPrint();
		LGPrint lg = new LGPrint();
		String doc = "자바 이론 문서";
		
		samsung.printCMYK(doc);
		samsung.print(doc);
		System.out.println();
		
		lg.print(doc);

	}

}
