package e04_example;

public class PartTimeWorker extends Employee {

	private int workTime;
	private int payPerHour;
	
	public PartTimeWorker(String name, int workTime, int payPerHour) {
		super(name, 0);
		this.workTime = workTime;
		this.payPerHour = payPerHour;
	}

	@Override
	public int getSalary() {
		return workTime * payPerHour / 10000;
	}
	
	@Override
	public void printEmployeeInfo() {
		System.out.println(name + " / " + getSalary() + "만원");
	}
	
	
		
}
