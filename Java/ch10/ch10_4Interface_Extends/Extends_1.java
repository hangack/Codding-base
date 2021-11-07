package ch10_4Interface_Extends;

public class Extends_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		implementationC impl = new implementationC();
		A ia = impl;
		ia.methodA();
		System.out.println();
		
		B ib = impl;
		ib.methodB();
		System.out.println();
		
		C ic = impl;
		ic.methodA();
		ic.methodB();
		ic.methodC();

	}

}
