package ch02_3DataType;

public class IntegerLiteral {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int var1=0b1011;	//2진수	0b or 0B	0 or 1
		int var2=0206;		//8진수	0로			0 ~ 7
		int var3=365;		//10진수				0 ~ 9
		int var4=0xB3;		//16진수	0x or 0X	0 ~ 9 & (a or A (= 10)) ~ (f or F (= 15))

		System.out.println("var1: "+var1);
		System.out.println("var2: "+var2);
		System.out.println("var3: "+var3);
		System.out.println("var4: "+var4);
	}
}
