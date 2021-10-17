package oop2;



class MyTv2 {
	boolean isPowerOn;
	int channel;
	int volume;
	final int MAX_VOLUME = 100;
	final int MIN_VOLUME = 0;
	final int MAX_CHANNEL = 100;
	final int MIN_CHANNEL = 1;
	
	
//코드
	
	//유효성검사 또 안했다
	
	public boolean isPowerOn() {
		return isPowerOn;
	}
	public void setisPowerOn(boolean isPowerOn) {
		
		this.isPowerOn = isPowerOn;
	}
	
	public int getChannel() {
		return channel;
		
	}
	public void setChannel(int channel){
		if(channel > MAX_CHANNEL || channel < MIN_CHANNEL)
			return;

		this.channel = channel;
	}
	public int getVolume() {
		return volume;
	}
	public void setVolume(int volume) {
		if(volume > MAX_VOLUME || volume < MIN_VOLUME)
			return;

		this.volume = volume;
	}
	
	
}

public class Ex_07_10 {

	public static void main(String[] args) {

		MyTv2 t = new MyTv2();
		t.setChannel(10);
		System.out.println("CH:"+t.getChannel());
		t.setVolume(20);
		System.out.println("VOL:"+t.getVolume());
	}

}


//실행결과 
//CH:10
//VOL:20