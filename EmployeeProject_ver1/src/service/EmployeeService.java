package service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

import dto.EmployeeDTO;

public class EmployeeService {
	private static EmployeeService instance;
	
	private ArrayList<EmployeeDTO> list;
	
	private EmployeeService() {
		list = new ArrayList<EmployeeDTO>();
		
		list.add(new EmployeeDTO("홍길동", "회계", 3200));
		list.add(new EmployeeDTO("김주동", "총무", 4200));
		list.add(new EmployeeDTO("박동욱", "개발", 2800));
		list.add(new EmployeeDTO("길동자", "인사", 2700));
	}

	public static EmployeeService getInstance() {
		if(instance == null)
			instance = new EmployeeService();
		return instance;
	}
	
	/**
	 * 전체 사원정보 출력하는 메서드
	 */
	public void printAll() {
		System.out.println("전체 사원 정보를 출력합니다.....");
		for(EmployeeDTO emp : list) {
			System.out.println(emp);
		}
		System.out.println();
	}

	/**
	 * 사원 정보 등록하는 메서드
	 * 이름, 부서, 급여 입력 받아서 등록
	 * @param sc 키보드로 입력 받는 객체
	 */
	public void add(Scanner sc) {
		System.out.println("사원 정보 등록을 시작합니다.....");
		System.out.print("이름 : ");
		String name = sc.nextLine();
		System.out.print("부서명 : ");
		String dept = sc.nextLine();
		System.out.print("급여 : ");
		int salary = Integer.parseInt(sc.nextLine());
		
		//리스트에 사원 객체 생성해서 등록
		list.add(new EmployeeDTO(name, dept, salary));
		System.out.println("사원 정보 등록 완료");
	}
	
	//사번으로 사원 검색하는 메서드
	private EmployeeDTO searchByEmpNo(int empNo) {
		//사번으로 검색하고 해당 Employee객체를 리스트에서 가져와서 리턴
		for(EmployeeDTO emp : list) {
			if(emp.getEmpNo() == empNo)
				return emp;
		}
		return null;
	}
	
	public void searchByEmpNo(Scanner sc) {
		System.out.println("사원 정보 검색을 시작합니다....");
		System.out.print("검색할 사원번호를 입력하세요 : ");
		int empNo = Integer.parseInt(sc.nextLine());
		
		EmployeeDTO emp = searchByEmpNo(empNo);
		
		if(emp == null) 
			System.out.println("입력하신 사번에 해당하는 사원이 없습니다.");
		else
			System.out.println(emp);
	}
	
	
}
