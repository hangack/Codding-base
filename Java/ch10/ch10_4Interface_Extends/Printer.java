package ch10_4Interface_Extends;

public interface Printer {
	void print(String doc);
}

interface ColorPrintable extends Printer {
	void printCMYK(String doc);
}

class SamgungPrint extends Samsung implements ColorPrintable {
	@Override
	public void printCMYK(String doc) {
		System.out.printf("%s",Samsung());
		System.out.printf("컬러 %s 인쇄\n",doc);
	}
	@Override
	public void print(String doc) {
		System.out.printf("%s",Samsung());
		System.out.printf("흑백 %s 인쇄\n",doc);
	}
}
class LGPrint extends LG implements Printer {
	@Override
	public void print(String doc) {
		System.out.printf("%s",LG());
		System.out.printf("흑백 %s 인쇄\n",doc);
	}
}

class Samsung {
	String Samsung(){
		return "3성";
	}
}
class LG {
	String LG(){
		return "LG";
	}
}
//class Print extends Samsung,LG {	//	클래스는 다중 상속이 불가능하다.
//	
//}