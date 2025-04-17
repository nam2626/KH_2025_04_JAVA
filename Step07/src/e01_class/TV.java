package e01_class;

public class TV {
	boolean power;
	boolean mute;
	int channel;
	int volume;
	final int MAX_CHANNEL = 756; 
	final int MIN_CHANNEL = 1; 
	final int MAX_VOLUME= 50; 
	final int MIN_VOLUME = 0; 
	
	void init() {
		channel = 10;
		volume = 6;
	}
	
	//전원OnOff 기능
	//	실행 할때마다 true <-> false
	void powerOnOff() {
		power = !power;
		System.out.println(power ? "TV 전원 On" : "TV 전원 Off");
	}
	
	//채널Up
	//	실행할떄마다 채널값을 1씩 증가, 마지막채널에서 증가하면 1번 채널로 순환
	void channelUp() {
		//전원이 켜져있을때만 동작
		if(!power) return;
		channel++;
		if(channel > MAX_CHANNEL) channel = MIN_CHANNEL;
		System.out.println("현재 채널 : " + channel);
	}
	
	//채널Down
	void channelDown() {
		if(!power) return;
		channel--;
		if(channel < MIN_CHANNEL) channel = MAX_CHANNEL;
		System.out.println("현재 채널 : " + channel);
	}
	
	//음소거
	void muteOnOff() {
		if(!power) return;
		mute = !mute;
		System.out.println(mute ? "음소거 On" : "음소거 Off");
	}
	
	//음량UP
	void volumeUp() {
		if(!power) return;
		if(mute) muteOnOff();
		if(volume < MAX_VOLUME) volume++;
		System.out.println("현재 음량 : " + volume);
	}
	
	//음량Down
	void volumeDown() {
		if(!power) return;
		if(mute) muteOnOff();
		if(volume > MIN_VOLUME) volume--;
		System.out.println("현재 음량 : " + volume);
	}
	
	
}











