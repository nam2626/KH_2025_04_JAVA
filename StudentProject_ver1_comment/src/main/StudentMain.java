package main;

import java.util.Scanner;
import service.StudentService;

// 학적 관리 프로그램의 메인 클래스
public class StudentMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StudentService service = new StudentService();

		// 프로그램이 종료될 때까지 계속 실행되는 무한 루프
		while(true) {
			// 메뉴 출력
			System.out.println("---- 학적 관리 프로그램 ----");
			System.out.println("  1. 학적 등록하기");
			System.out.println("  2. 학적 수정하기");
			System.out.println("  3. 학적 검색하기");
			System.out.println("  4. 학적 삭제하기");
			System.out.println("  5. 전체 학적 출력하기");
			System.out.println("  0. 프로그램 종료");
			System.out.print("  원하시는 번호 입력 : ");

			int no = sc.nextInt();
			sc.nextLine(); // 입력 버퍼의 엔터를 제거

			// 사용자가 입력한 번호에 따라 해당 작업 실행
			switch(no) {
				case 0:
					// 프로그램 종료
					System.out.println("프로그램이 종료 되었습니다.");
					return;
				case 1:
					service.addStudent(sc); // 학생 등록
					break;
				case 2:
					service.updateStudent(sc); // 학생 정보 수정
					break;
				case 3:
					service.searchStudentNo(sc); // 학번으로 검색
					break;
				case 4:
					service.deleteStudent(sc); // 학생 정보 삭제
					break;
				case 5:
					service.printAllStudent(); // 전체 학생 정보 출력
					break;
				case 6:
					service.searchStudentName(sc); // 이름으로 검색
					break;
				default:
					System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
			}
		}
	}
}
