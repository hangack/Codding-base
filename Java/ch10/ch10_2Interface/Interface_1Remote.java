package ch10_2Interface;

public class Interface_1Remote {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("1.----------");
		MyClass my1 = new MyClass();
		my1.rc.turnOn();
		my1.rc.setVolume(5);

		System.out.println("2.----------");
		MyClass my2 = new MyClass(new RemoteAudio());
		
		System.out.println("3.----------");
		MyClass my3 = new MyClass();
		my3.methodA();
		
		System.out.println("3.----------");
		MyClass my4 = new MyClass();
		my4.methodB(new RemoteTv());

	}

}

class MyClass{
	RemoteControl rc = new RemoteTv();

	MyClass() {}
	MyClass(RemoteControl rc) {
		this.rc = rc;
		rc.turnOn();
		rc.setVolume(5);
		
	}
	void methodA() {
		RemoteControl rc = new RemoteAudio();
		rc.turnOn();
		rc.setVolume(7);
	}
	void methodB(RemoteControl rc) {
		rc.turnOn();
		rc.setVolume(3);
	}
	
}