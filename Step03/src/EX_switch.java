
public class EX_switch {

	public static void main(String[] args) {
		int no = 3;
		//---------
		switch(no) {
		case 1, 3, 5, 7, 9:
			System.out.println("홀수");
			break;
		case 2, 4, 6, 8, 10:
			System.out.println("짝수");
			break;
		default:
			System.out.println("Test");
		}
		//---------
		switch(no) {
			case 1,3,5,7,9 -> {
				System.out.println("홀수");
			}
			case 2,4,6,8,10 -> {
				System.out.println("짝수");
			}
			default -> {
				System.out.println("Test");
			}
		}
		//----------
		//결과값 저장할 타입은 제한 없음
		String result = switch(no) {
			case 1,3,5,7,9 -> {
				System.out.println("홀수");
				yield "홀수";
			}
			case 2,4,6,8,10 -> {
				System.out.println("짝수");
				yield "짝수";
			}
			default -> {
				System.out.println("Test");
				yield "몰라?";
			}
		};
		System.out.println(result);
		
	}

}





