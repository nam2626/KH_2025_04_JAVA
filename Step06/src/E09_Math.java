
public class E09_Math {
	/*
	 * 	Math 클래스
	 * 		수학적인 값과 기능을 미리 가지고 있는 클래스
	 * 
	 */
	public static void main(String[] args) {
		//절대값
		System.out.println(Math.abs(-100));
		
		//소수점 올림
		System.out.println(Math.ceil(3.4));//4
		System.out.println(Math.ceil(-3.4));//-3
		
		//소수점 내림
		System.out.println(Math.floor(3.4));//3
		System.out.println(Math.floor(-3.4));//-4
		
		//소수점 반올림
		System.out.println(Math.round(3.4));
		System.out.println(Math.round(-3.4));
		
		//삼각함수, 사인, 코사인, 탄젠트 각각 45도에 해당하는 결과를 출력
		System.out.println(Math.sin(Math.toRadians(45)));
		
		//PI
		System.out.println(Math.PI);
		
		//랜덤
		System.out.println(Math.random());
		
		System.out.println("큰값 : "+Math.max(10, 20));
		System.out.println("작은값 : "+Math.min(10, 20));
		System.out.println(Math.pow(2, 10));
		
	}

}






