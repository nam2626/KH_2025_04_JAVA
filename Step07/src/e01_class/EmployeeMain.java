package e01_class;

public class EmployeeMain {

	public static void main(String[] args) {
		Employee e1 = new Employee();
		e1.init("1111", "김씨", '남', "사원", "회계", 3200);
		e1.printEmployeeInfo();
		e1.updateSalary(10000);
		e1.printEmployeeInfo();
	}

}
