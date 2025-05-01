package e04_anonymous;
/*
 * 	Army 클래스
 * 		필드
 * 			Gun 클래스
 * 		메서드
 * 			총을 쏘는 행위
 * 			총을 재장전하는 행위
 * 			총기를 교체하는 행위
 * 			
 * 
 */
public class Army {
	
	private Gun gun;

	public Army(Gun gun) {
		this.gun = gun;
	}

	public void shot() {
		gun.shot();
	}
	
	public void reload() {
		gun.reload();
	}
	
	public void changeGun(Gun gun) {
		this.gun = gun;
	}
	
}






