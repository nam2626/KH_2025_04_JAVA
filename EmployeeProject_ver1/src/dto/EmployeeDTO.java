package dto;
/**
 * 	사원 정보 저장하는 클래스
 * 		사번, 이름, 부서, 급여 정보를 가지고 있음
 */
public class EmployeeDTO {
	private final int empNo;
	private String name;
	private String dept;
	private int salary;

	public EmployeeDTO() {
		this.empNo = 0;
	}

	public EmployeeDTO(String name, String dept, int salary) {
		this.empNo = 0;
		this.name = name;
		this.dept = dept;
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public int getEmpNo() {
		return empNo;
	}

	@Override
	public String toString() {
		return "[" + empNo + "] / " + name + " / " 
				+ dept + " / " + salary;
	}
	
	
	

	
	
	
	
	
}
