package ch10_2Interface;
public class Remote{}

class RemoteAudio implements RemoteControl{		//	인터페이스의 구현클래스는 implements [클래스] 를 명시한다.
	private int volume;
	@Override
	public void turnOn() {
		System.out.println("Audio on");
	}
	@Override
	public void turnOff() {
		System.out.println("Audio off");
	}
	@Override
	public void setVolume(int volume) {
		if		(volume>RemoteControl.MAX_VOLUME) 	this.volume = RemoteControl.MAX_VOLUME;
		else if	(volume<RemoteControl.MIN_VOLUME) 	this.volume = RemoteControl.MIN_VOLUME;
		else										this.volume = volume;
		System.out.println("현재 Audio 볼륨: "+this.volume);
		
	}

}

class RemoteTv implements RemoteControl{
	private int volume;
	@Override
	public void turnOn() {
		System.out.println("Audio on");
	}
	@Override
	public void turnOff() {
		System.out.println("Audio off");
	}
	@Override
	public void setVolume(int volume) {
		if		(volume>RemoteControl.MAX_VOLUME) 	this.volume = RemoteControl.MAX_VOLUME;
		else if	(volume<RemoteControl.MIN_VOLUME) 	this.volume = RemoteControl.MIN_VOLUME;
		else										this.volume = volume;
		System.out.println("현재 TV 볼륨: "+this.volume);
		
	}
}