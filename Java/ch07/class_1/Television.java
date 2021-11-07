package class_1;

public class Television {
	int channel, volume;
	boolean OnOff;

	public void tv() {
		System.out.printf("MY; 채널:%3d, 볼륨:%3d, 전원부:%5b\n",channel,volume,OnOff);
	}
	
	int ch_get() {
		return channel;
	}
	void ch_set(int set) {
		channel = set;
	}

}
