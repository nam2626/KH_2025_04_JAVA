package e02_generic_extends;

public class MouseMain {

	public static void main(String[] args) {
		GamingMouse gamingMouse = new GamingMouse();
		OfficeMouse officeMouse = new OfficeMouse();
		
//		Office 마우스는 Mouse를 구현하지 않아서 제네릭 지정하는 타입으로 못씀
//		MouseHUB<OfficeMouse> hub = 
//				new MouseHUB<OfficeMouse>(officeMouse);
		
		MouseHUB<GamingMouse> hub = 
				new MouseHUB<GamingMouse>(gamingMouse);
		hub.click(1);
		hub.click(3);
		hub.click(2);
		hub.wheel();
	}

}
