package main;

import java.util.Scanner;

import service.StudentService;

public class StudentMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StudentService service = new StudentService();
		
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
			sc.nextLine();//엔터 제거
			
			//숫자 0 입력했을때 종료
			switch(no) {
			case 0:
				System.out.println("프로그램이 종료 되었습니다.");
				return;
			case 1:
				service.addStudent(sc);
				break;
			case 2:
				service.updateStudent(sc);
				break;
			case 3:
				service.searchStudentNo(sc);
				break;
			case 4:
				service.deleteStudent(sc);
				break;
			case 5:
				service.printAllStudent();
				break;
			case 6:
				service.searchStudentName(sc);
				break;
			}
		}
	}

}
