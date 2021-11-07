package ch03_01inout;

public class KeyCode {

	public static void main(String[] args) throws Exception {		// read의 입출력 오류 '예외 처리'
		// TODO Auto-generated method stub
		int keycode;
		
		keycode = System.in.read();
		System.out.println("keycode: "+keycode);

	}

}
