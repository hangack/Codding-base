package ch02_2Varialbe;

public class VariableScope {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int v1=15,v2,v3;

		if(v1>10) {
			v2=0;
			v2=v1-10;
			v3=v1+v2+5;
			System.out.println(v3);
		}

	}

}
