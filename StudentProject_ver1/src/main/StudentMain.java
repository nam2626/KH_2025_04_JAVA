package main;

import java.util.Scanner;

public class StudentMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("---- 학적 관리 프로그램 ----");
			System.out.println("  1. 학적 등록하기");
			System.out.println("  2. 학적 수정하기");
			System.out.println("  3. 학적 검색하기");
			System.out.println("  4. 학적 삭제하기");
			System.out.println("  5. 전체 학적 출력하기");
			System.out.println("  0. 프로그램 종료");
			System.out.print("  원하시는 번호 입력 : ");
			int no = sc.nextInt();
			
			//숫자 0 입력했을때 종료
			switch(no) {
			case 0:
				System.out.println("프로그램이 종료 되었습니다.");
				return;
			}
		}
	}

}
