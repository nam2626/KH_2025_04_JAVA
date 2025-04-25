package e07_has_a;

/*
 * 	군인 클래스에서 총 정보를 모두 가지고 있음.
 * 	군인이 총쏘는 행위를 하면 총을 발사(shot 기능 실행)
 * 	군인이 총을 재장전 하는 행위를 하면 탄창을 교체(reload 기능 실행)
 * 	
 * 	PlayMain 클래스에서 Army를 생성해서 shot, reload를 테스트
 * 
 * 	객체와 객체의 has a 관계를 상속 구조로 구현하게 되면 문제가 발생
 * 	Army의 경우 다양한 총기를 교체를 해야되는데, 
 * 	상속으로 구현하면, 총기하나에 귀속, 확장성이 떨어짐
 * 	총기 교환을 할려면 코드를 수정하거나 새로운 다른 Army를 생성
 * 	이런 문제들 때문에 has a 관계를 표현할 때는 
 * 	상속 구조로 표현하지 않고 포함(Composition) 관계로 만듬
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




