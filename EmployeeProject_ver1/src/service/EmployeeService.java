package service;

import java.util.ArrayList;
import java.util.Iterator;

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

	
	
	
}
