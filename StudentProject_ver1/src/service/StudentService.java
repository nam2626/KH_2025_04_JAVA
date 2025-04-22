package service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

import dto.StudentDTO;

public class StudentService {
	private ArrayList<StudentDTO> list;

	public StudentService() {
		list = new ArrayList<StudentDTO>();
		//샘플 데이터 5건 추가
		list.add(new StudentDTO("20001001", "홍길동", "전자공학과", 3.2));
		list.add(new StudentDTO("20001002", "김철수", "컴퓨터공학과", 4.2));
		list.add(new StudentDTO("20001003", "박명수", "국문학과", 1.2));
		list.add(new StudentDTO("20001004", "이철우", "경영정보학과", 3.6));
		list.add(new StudentDTO("20001005", "정동수", "경제학과", 2.7));
	}
	
	//전체 데이터 출력하는 메서드
	//리스트 처음부터 마지막까지 데이터를 출력
	public void printAllStudent() {
		for(int i=0;i < list.size();i++) {
			System.out.println(list.get(i));
//			System.out.println(list.get(i).toString());
		}
	}
	
	//학생 정보 1건 등록하는 메서드
	//학생 정보를 사용자로부터 입력 받은 후에 list에 저장
	public void addStudent(Scanner sc) {
		System.out.println("학생정보를 추가합니다.......");
		//학생 정보 입력 받음
		System.out.print("등록할 학번 입력 : ");
		String studentNo = sc.nextLine();
		System.out.print("등록할 학생 이름 입력 : ");
		String studentName = sc.nextLine();
		System.out.print("등록할 학과명 입력 : ");
		String majorName = sc.nextLine();
		System.out.print("등록할 평점 입력 : ");
		double score = sc.nextDouble();
//		sc.nextLine();
		//StudentDTO 생성해서 list에 추가
//		StudentDTO dto = new StudentDTO(studentNo, studentName, majorName, score);
//		list.add(dto);
		list.add(new StudentDTO(studentNo, studentName, majorName, score));
		
	}

	public void searchStudentNo(Scanner sc) {
		//1. 검색할 학번 입력
		System.out.println("학생정보를 검색합니다.......");
		//학생 정보 입력 받음
		System.out.print("검색할 학번 입력 : ");
		String studentNo = sc.nextLine();
		//검색하는 메서드 실행
		int idx = searchStudentNo(studentNo);
		
		if(idx != -1) {
			System.out.println(list.get(idx));
		}else {
			//검색 결과가 없으면 "해당 학번을 가진 학생은 없습니다."
			System.out.println("해당 학번을 가진 학생은 없습니다.");
		}
	}
	
	//학번을 외부에서 받아와서 검색
	private int searchStudentNo(String studentNo) {
		for(int i=0;i<list.size();i++) {
			//문자열 내용이 같은지 비교하는 메서드 equals
			if(studentNo.equals(list.get(i).getStudentNo())) {
				return i;
			}
		}
		return -1;
	}
	
	public void deleteStudent(Scanner sc) {
		System.out.println("학생 정보 삭제를 시작합니다.....");
		System.out.print("삭제할 학번 입력 : ");
		String studentNo = sc.nextLine();
		//검색하는 메서드 실행
		int idx = searchStudentNo(studentNo);
		
		if(idx == -1)
			System.out.println("삭제할 학생 정보가 없습니다.");
		else {
			list.remove(idx);
			System.out.println("학생 정보 삭제하였습니다.");
		}
		
	}

	public void updateStudent(Scanner sc) {
		//수정할 학번 입력
		//학번에 해당하는 학생을 검색
		System.out.println("학생 정보 수정을 시작합니다.....");
		System.out.print("수정할 학번 입력 : ");
		String studentNo = sc.nextLine();
		
		int idx = searchStudentNo(studentNo);
		
		if(idx == -1) System.out.println("수정할 학생 정보가 없습니다.");
		else {
			//수정할 학생이 있을때, 이름, 학과명, 평점을 받아서 저장
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

	public void searchStudentName(Scanner sc) {
		System.out.println("학생 이름으로 검색을 시작합니다....");
		//1. 학생 이름 일부를 입력 받음
		System.out.print("검색할 이름 입력 : ");
		String studentName = sc.nextLine();
		//2. 전체 학생 정보 접근하면서
		//	 입력받은 문자열이 학생 이름에 포함되어 있으면 출력
		for(StudentDTO std : list) {
//			문자열 부분일치 검색시 조건문 주의할점
//			검색어 : 수
//			"수" 문자열에 "김철수"가 있냐?
//			if(studentName.indexOf(std.getStudentName()) != -1) {}
			
//			"김철수" 문자열에 "수"가 있냐?
			if(std.getStudentName().indexOf(studentName) != -1) {
				System.out.println(std);
			}
		}
		
	}
	
	
	
	
}
