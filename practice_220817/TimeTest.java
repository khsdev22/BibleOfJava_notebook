package practice_220817;

public class TimeTest {
	public static void main(String[] args) {
		Time t = new Time(12,35,50);
		System.out.println(t);
		t.setHour(t.getHour()+1);
		System.out.println(t);
	}
}

class Time{
	private int hour, minute, second;
	
	Time(int hour, int minute, int second){
		setHour(hour);
		setMinute(minute);
		setSecond(second);
	}
	
	public int getHour() { return hour; }
	
	public void setHour(int hour) {
		if(hour < 0 || hour > 23) return;
		this.hour = hour;
	}
	
	public int gerMinute() { return minute;}
	
	public void setMinute(int minute) {
		if ( minute < 0 || minute > 59) return;
		this.minute = minute;
	}
	
	public int gerSecond() { return second;}
		
	public void setSecond(int second) {
		if ( minute < 0 || minute > 59) return;
		this.second = second;
	}
	
	public String toString() {
		return hour + ":" + minute + ":" + second;
	}
}
