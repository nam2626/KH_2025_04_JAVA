package service;

import java.util.ArrayList;
import java.util.Scanner;
import dto.StudentDTO;

// 학생의 정보를 관리하는 여러 가지 기능을 제공하는 서비스 클래스
public class StudentService {
	
	// 학생 정보를 저장하는 ArrayList
	private ArrayList<StudentDTO> list;

	// 기본 생성자: 프로그램 시작 시 미리 저장된 샘플 데이터가 5개 들어감
	public StudentService() {
		list = new ArrayList<StudentDTO>();
		
		// 샘플 학생 데이터 추가
		list.add(new StudentDTO("20001001", "홍길동", "전자공학과", 3.2));
		list.add(new StudentDTO("20001002", "김철수", "컴퓨터공학과", 4.2));
		list.add(new StudentDTO("20001003", "박명수", "국문학과", 1.2));
		list.add(new StudentDTO("20001004", "이철우", "경영정보학과", 3.6));
		list.add(new StudentDTO("20001005", "정동수", "경제학과", 2.7));
	}
	
	// 현재 저장된 모든 학생 정보를 출력하는 메서드
	public void printAllStudent() {
		for(int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
	}

	// 새 학생 정보를 입력받아 등록하는 메서드
	public void addStudent(Scanner sc) {
		System.out.println("학생 정보를 추가합니다.......");
		
		// 사용자에게서 학생 정보 입력 받음
		System.out.print("등록할 학번 입력 : ");
		String studentNo = sc.nextLine();
		System.out.print("등록할 학생 이름 입력 : ");
		String studentName = sc.nextLine();
		System.out.print("등록할 학과명 입력 : ");
		String majorName = sc.nextLine();
		System.out.print("등록할 평점 입력 : ");
		double score = sc.nextDouble();

		// 입력받은 정보를 StudentDTO 객체로 만들어 리스트에 추가
		list.add(new StudentDTO(studentNo, studentName, majorName, score));
	}

	// 사용자로부터 학번을 입력받아 해당 학생 정보를 검색하여 출력하는 메서드
	public void searchStudentNo(Scanner sc) {
		System.out.println("학생 정보를 검색합니다.......");
		System.out.print("검색할 학번 입력 : ");
		String studentNo = sc.nextLine();
		
		// 내부 메서드를 호출하여 학생 인덱스를 찾음
		int idx = searchStudentNo(studentNo);

		// 검색 결과가 있으면 학생 정보 출력, 없으면 안내 메시지 출력
		if(idx != -1) {
			System.out.println(list.get(idx));
		} else {
			System.out.println("해당 학번을 가진 학생은 없습니다.");
		}
	}

	// 주어진 학번을 이용하여 학생 정보를 찾아 해당 리스트의 인덱스를 반환하는 내부 메서드
	private int searchStudentNo(String studentNo) {
		for(int i = 0; i < list.size(); i++) {
			if(studentNo.equals(list.get(i).getStudentNo())) {
				return i; // 찾았을 경우 해당 인덱스를 반환
			}
		}
		return -1; // 찾지 못한 경우 -1을 반환
	}

	// 사용자로부터 학번을 입력받아 학생 정보를 삭제하는 메서드
	public void deleteStudent(Scanner sc) {
		System.out.println("학생 정보 삭제를 시작합니다.....");
		System.out.print("삭제할 학번 입력 : ");
		String studentNo = sc.nextLine();

		int idx = searchStudentNo(studentNo);
		
		// 인덱스가 -1이 아니면(즉, 학생 정보가 존재하면) 삭제 수행
		if(idx == -1)
			System.out.println("삭제할 학생 정보가 없습니다.");
		else {
			list.remove(idx);
			System.out.println("학생 정보를 삭제하였습니다.");
		}
	}

	// 사용자로부터 학번을 입력받아 해당 학생의 정보를 수정하는 메서드
	public void updateStudent(Scanner sc) {
		System.out.println("학생 정보 수정을 시작합니다.....");
		System.out.print("수정할 학번 입력 : ");
		String studentNo = sc.nextLine();

		int idx = searchStudentNo(studentNo);
		if(idx == -1) {
			System.out.println("수정할 학생 정보가 없습니다.");
		} else {
			System.out.print("수정할 학생 이름 입력 : ");
			String studentName = sc.nextLine();
			System.out.print("수정할 학과명 입력 : ");
			String majorName = sc.nextLine();
			System.out.print("수정할 평점 입력 : ");
			double score = sc.nextDouble();

			StudentDTO student = list.get(idx);
			student.setStudentName(studentName);
			student.setMajorName(majorName);
			student.setScore(score);

			System.out.println("학생 정보를 수정하였습니다.");
		}
	}

	// 이름의 일부로 학생 정보를 검색하여 출력하는 메서드
	public void searchStudentName(Scanner sc) {
		System.out.println("학생 이름으로 검색을 시작합니다....");
		System.out.print("검색할 이름 입력 : ");
		String studentName = sc.nextLine();

		// 입력받은 문자열이 학생 이름에 포함되어 있으면 정보를 출력
		for(StudentDTO std : list) {
			if(std.getStudentName().indexOf(studentName) != -1) {
				System.out.println(std);
			}
		}
	}
}
