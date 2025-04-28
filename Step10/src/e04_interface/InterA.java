package e04_interface;

public interface InterA {
	public static final double PI = 3.1415;
	//public static final 안써도 자동으로 붙음
	//double PI = 3.1415;
	
	public abstract void interA();
	//public abstract 안써도 자동으로 붙음
	void interA1();
	
	//디폴트 메서드 --> jdk8버전부터 지원
	default double circleArea(double r) {
		return r * r * PI;
	}
	
}



