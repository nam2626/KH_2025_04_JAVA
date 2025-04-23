package main;

import java.util.Scanner;

import service.EmployeeService;

public class EmployeeMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		EmployeeService service = EmployeeService.getInstance();
		
		while(true) {
			//메뉴 출력
			System.out.print("1. 등록  2. 전체출력  "
					+ "3. 사번검색  4. 이름검색  "
					+ "5. 급여수정  6. 삭제  0. 종료\n>> ");
			//메뉴 번호 입력 받고
			int no = sc.nextInt();
			sc.nextLine();
			//서비스에 있는 해당 기능 실행
			switch(no) {
			case 0:
				System.out.println("프로그램을 종료합니다.");
				return;
			case 2:
				service.printAll();
				break;
			}
		}
		
	}

}





