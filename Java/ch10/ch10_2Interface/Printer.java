package ch10_2Interface;

public interface Printer {
	void Printer(String print);
}

class SamsungPrint implements Printer{
	@Override
	public void Printer(String print){
		System.out.println("3º∫ «¡∏∞≈Õ");
		System.out.printf("%s ¿Œº‚\n",print);
	}
}

class LGPrint implements Printer{
	@Override
	public void Printer(String print){
		System.out.println("≈∑¡„ «¡∏∞≈Õ");
		System.out.printf("%s ¿Œº‚\n",print);
	}
}
