package e07_has_a;

/*
 * 	군인 클래스에서 총 정보를 모두 가지고 있음.
 * 	군인이 총쏘는 행위를 하면 총을 발사(shot 기능 실행)
 * 	군인이 총을 재장전 하는 행위를 하면 탄창을 교체(reload 기능 실행)
 * 	
 * 	PlayMain 클래스에서 Army를 생성해서 shot, reload를 테스트
 */

public class Army extends Gun {

	//군인이 총쏘는 행위
	@Override
	public void shot() {
		super.shot();
	}

	//군인이 재장전하는 행위
	@Override
	public void reload() {
		super.reload();
	}
}




