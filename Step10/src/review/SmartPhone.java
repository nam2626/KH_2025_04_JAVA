package review;

public class SmartPhone implements Radio, MusicPlayer {

	@Override
	public void playMusic() {
		System.out.println("음악 재생");
	}

	@Override
	public void playRadio() {
		System.out.println("라디오 재생");
	}

}
