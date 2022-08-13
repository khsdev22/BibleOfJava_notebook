package ch7;

class Tv{
	boolean power;
	int channel;
	
	void power()       { power = !power;}
	void channelUp()   { ++channel;     }
	void channelDown() { --channel;     }
}

class CaptionTv extends Tv{
	boolean caption; // 캡션 상태 (on/off)
	void displayCaption(String text) {
		if(caption) {
			System.out.println(text);
		}
	}
}

public class CaptionTvTest {
	public static void main(String[] args) {
		CaptionTv ctv = new CaptionTv();
		ctv.channel = 10;
		ctv.channelUp();
		System.out.println("Channel_Number : " + ctv.channel);
		ctv.channelDown();
		System.out.println("Channel_Number : " + ctv.channel);
		ctv.displayCaption("Hello Brother!");
		ctv.caption = true;
		ctv.displayCaption("Hello Brother!");
		ctv.power();
		System.out.println(ctv.power);
		ctv.power();
		System.out.println(ctv.power);
		
	}
	
}
