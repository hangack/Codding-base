package class_1;

public class Class_TV01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Television tv = new Television();
		tv.channel = 7;
		tv.volume = 9;
		tv.OnOff = true;
		System.out.printf("tv 채널: %d, 볼룸: %d, 전원부: %b\n", tv.channel, tv.volume, tv.OnOff);
		

		Television mytv,urtv;
		mytv = new Television();
		urtv = new Television();
		mytv.channel = 7; urtv.channel = 9;
		mytv.volume = 9; urtv.volume = 12;
		mytv.OnOff = true; urtv.OnOff = false;
		
		System.out.printf("MY; 채널:%3d, 볼륨:%3d, 전원부:%5b\n",mytv.channel,mytv.volume,mytv.OnOff);
		System.out.printf("UR; 채널:%3d, 볼륨:%3d, 전원부:%5b\n",urtv.channel,urtv.volume,urtv.OnOff);

		mytv.tv();
		urtv.tv();

//		int ch = mytv.channal
		int ch = mytv.ch_get();
		System.out.printf("현재채널: %d\n", ch);
		mytv.ch_set(11);
		ch = mytv.ch_get();
		System.out.printf("현재채널: %d\n", ch);
		
	}
}
