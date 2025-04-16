package e01_class;

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
	
	//메서드
	//사원정보 초기화
	void init(String eno, String ename, char eGender, 
			String pos, String dept, int s ) { 
		empNo = eno;
		empName = ename;
		empGender = eGender;
		posistion = pos;
		department = dept;
		salary = s;		
	}
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









