
public class E10_Quest {

	public static void main(String[] args) {
		int age = 6;
		
		//age에 저장된 나이 값에 따라서, 성인, 고등학생, 중학생, 초등학생, 미취학 아동
		//성인 20세 이상, 고등학생 17~19, 중학생 14~16, 초등학생 8~13, 8세 미만 미취학 아동
		//if, else if, else 활용해서 출력
		if(age >= 20) {
			System.out.println("성인");
		}else if(age >= 17 && age <= 19) {
			System.out.println("고등학생");
		}else if(age >= 14 && age <= 16) {
			System.out.println("중학생");
		}else if(age >= 8 && age <= 13) {
			System.out.println("초등학생");
		}else{
			System.out.println("미취학 아동");
		}
		
		//-----------------------------------
		if(age <= 7) {
			System.out.println("미취학 아동");
		}else if(age <= 13) {
			System.out.println("초등학생");
		}else if(age <= 16) {
			System.out.println("중학생");
		}else if(age <= 19) {
			System.out.println("고등학생");
		}else {
			System.out.println("성인");
		}
		
	}

}





