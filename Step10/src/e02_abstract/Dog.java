package e02_abstract;

public class Dog extends Animal{

	@Override
	public void run() {
		// run 메서드는 추상 메서드를 재정의 한것이라
		// super.run()을 사용할 수 없다. <-- 추상 메서드라 안만들어져 있음.
		System.out.println("개가 네발로 달립니다.");
		
	}
	
}
