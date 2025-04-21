package e06_static;

public class Number {
	/*
	 * 	싱글톤 패턴
	 * 		디자인 패턴 중 하나
	 * 		특정 클래스의 객체(인스턴스)가 프로그램 내에서 하나만 생성되도록 보장
	 * 		해당 객체(인스턴스)는 모든 클래스가 접근 할 수 있는 방법(메서드)을 제공
	 * 
	 * 	1. 시스템 전체에서 공유해야 되는 자원이나 설정 정보를 하나의 객체로 관리.
	 * 	2. 객체 생성이 최소화 되니까 메모리 사용을 효율적으로 할 수 있음.
	 * 	3. 어디서든 동일한 인스턴스에 접근할 수가 있음.
	 */
	
	//1. 싱글톤 패턴을 적용할 클래스를 private static으로 객체 생성
	private static Number instance = new Number();

	//필드
	private static int num;
	
	//2. 생성자는 private 생성자로 작성
	private Number() {
		num++;
	}

	//3. 1번에 있는 인스턴스를 반환하는 public static get 메서드 작성 
	public static Number getInstance() {
		if(instance == null)
			instance = new Number();
		return instance;
	}
	
	public int getNum() {
		return num;
	}
	
	
	
}

