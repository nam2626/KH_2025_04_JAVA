package e06_iot;

import java.util.ArrayList;

public class IotApp {
	private ArrayList<Power> list;

	public IotApp() {
		list = new ArrayList<Power>();
		list.add(new Light());
		list.add(new Light());
		list.add(new TV());
		list.add(new AirCon());
	}
	
	/**
	 * Iot기기 등록하는 메서드
	 * @param device 등록할 Iot 기기 
	 */
	public void addDevice(Power device) {
		list.add(device);
	}
	
	//전체 전원 켜기
	public void powerAllOnDevice() {
		for(int i=0;i<list.size();i++) {
			list.get(i).powerOn();
		}
	}
	
	//전체 전원 끄기
	public void powerAllOffDevice() {
		list.forEach(t -> {
			t.powerOff();
		});
	}
	
	
}








