import java.util.Scanner;

public class E19_GaBaBo {
	/*
	 * 	가위 바위 보를 1판 진행
	 * 	사용자로부터 숫자로 가위 - 1, 바위 - 2, 보 - 3에 해당하는 숫자를 입력
	 * 	컴퓨터는 랜덤으로 가위, 바위, 보 숫자를 생성(1 ~ 3)
	 * 	사용자가 이겼는지?, 졌는지?, 비겼는지 출력
	 * 
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
						 //0     1     2
		String[] item = {"가위","바위","보"};
		
		System.out.print("가위 - 1, 바위 - 2, 보 - 3 : ");
		int player = sc.nextInt();
		int com = (int)(Math.random() * 3) + 1;
		
		System.out.println("사용자 : " +item[player-1] + ", 컴퓨터 : " + item[com-1]);
		if(player == com % 3 + 1) {
			System.out.println("사용자가 이겼습니다.");
		}else if(player == com) {
			System.out.println("비겼습니다.");
		}else {
			System.out.println("컴퓨터가 이겼습니다.");
		}
		
		
	}

}







