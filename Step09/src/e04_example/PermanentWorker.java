package e04_example;

public class PermanentWorker extends Employee{

	public PermanentWorker(String name, int salary) {
		super(name, salary);
	}
	
	@Override
	public int getSalary() {
		return salary / 12;
	}
	
	@Override
	public void printEmployeeInfo() {
		System.out.println(name + " / " + getSalary());
	}
	
	
}
