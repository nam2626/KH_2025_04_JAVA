package service;

import java.util.ArrayList;

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

	
	
	
}
