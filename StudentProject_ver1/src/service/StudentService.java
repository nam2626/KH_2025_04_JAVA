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
	
	
	
	
}
