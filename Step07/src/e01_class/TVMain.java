package e01_class;

public class TVMain {

	public static void main(String[] args) {
		TV tv = new TV();
		tv.powerOnOff();
		tv.powerOnOff();
		tv.powerOnOff();
		
		for(int i=0;i<800;i++)
			tv.channelUp();
		for(int i=0;i<100;i++)
			tv.channelDown();
		for(int i=0;i<100;i++)
			tv.volumeUp();
		tv.muteOnOff();
		for(int i=0;i<100;i++)
			tv.volumeDown();;
	}

}
