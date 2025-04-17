package e02_constructor;

public class EmployeeMain {

	public static void main(String[] args) {
		String empNo = "1111";
		String empName = "김철수";
		String posistion = "대리";
		char empGender = '남';
		String department = "회계";
		int salary = 3200;
		
		Employee emp1 = new Employee(empNo, empName, empGender, posistion, department, salary);
		emp1.printEmployeeInfo();
		System.out.println(emp1.toString());
		System.out.println(emp1);
	}

}
