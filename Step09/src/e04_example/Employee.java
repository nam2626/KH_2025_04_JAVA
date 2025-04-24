package e04_example;

public class Employee {
	protected String name;
	protected int salary;
	
	public Employee(String name, int salary) {
		this.name = name;
		this.salary = salary;
	}

	public int getSalary() {
		return salary;
	}

	public void printEmployeeInfo() {
		System.out.println(name + " / " + salary);
	}
	
	public void work() {
		System.out.println("직원이 일을 합니다.");
	}
	
}
