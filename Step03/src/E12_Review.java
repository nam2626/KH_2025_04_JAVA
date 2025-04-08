import java.util.Scanner;

public class E12_Review {
	/*
	 * 점수 하나 입력 받아서 등급 출력
	 * 90점 이상 : A
	 * 80점 이상 : B
	 * 70점 이상 : C
	 * 60점 이상 : D
	 * 나머지 : F
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("점수 입력 : ");
		int score = sc.nextInt();
		
		String grade = "F";
		
		if(score >= 90) 
			grade = "A";
		else if(score >= 80) 
			grade = "B";
		else if(score >= 70) 
			grade = "C";
		else if(score >= 60) 
			grade = "D";
		
		if(!grade.equals("F") && score % 10 >= 5) 
			grade += "+";
		
		System.out.println(grade);
	}

}








