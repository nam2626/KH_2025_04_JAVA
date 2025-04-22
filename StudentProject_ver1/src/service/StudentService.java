package service;

import java.util.ArrayList;
import java.util.Iterator;

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
	
	
	
}
