package Practice;

public class Practice_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle cir[] = new Circle[5];
		
		for(int i =0; i<cir.length; i++) {
			cir[i] = new Circle();
			cir[i].r = i;
			cir[i].Cira();
		}
	}

}
