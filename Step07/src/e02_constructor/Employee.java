package e02_constructor;

public class Employee {
	//사번
	String empNo;
	//이름
	String empName;
	//성별
	char empGender;
	//직급
	String posistion;
	//부서
	String department;
	//연봉
	int salary;

	@Override
	public String toString() {
		return "Employee [empNo=" + empNo + ", empName=" + empName + ", empGender=" + empGender + ", posistion="
				+ posistion + ", department=" + department + ", salary=" + salary + "]";
	}

	//전체 필드 초기화하는 생성자
	public Employee(String empNo, String empName, char empGender, String posistion, String department, int salary) {
		super();
		this.empNo = empNo;
		this.empName = empName;
		this.empGender = empGender;
		this.posistion = posistion;
		this.department = department;
		this.salary = salary;
	}
	
	//메서드
	//사원정보 출력
	void printEmployeeInfo() {
		System.out.printf("%s %s %s %s %s %d\n",empNo, empName, 
							empGender, posistion, department, salary);
	}
	//연봉 수정하는 메서드
	boolean updateSalary(int s) {
		if(s >= 2400) {
			salary = s;
			return true;
		}
		return false;
	}
	
	
		
}









