package ch02_3DataType;

public class Byte {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte var1 = -128;
		byte var2 = -30;
		byte var3 = -0;
		byte var4 = 30;
		byte var5 = 127;
	//	byte var6 = 128;
		/* type mismatch
		 * 1byte = 8bit, 1st bit = positive(+zero) or negative at the num. 
		 * then positive: no(0~127) = 128 , negative: no(-1~-128) = 128
		 */

		System.out.println(var1);
		System.out.println(var2);
		System.out.println(var3);
		System.out.println(var4);
		System.out.println(var5);
	//	System.out.println(var6);

	}

}
