package e04_example;

public class ForeignWorker extends PermanentWorker{
	//1 - 기존 급여에 2배, 2 - 기존 급여에 1.5배, 3 - 1.2배
	private int risk;

	public ForeignWorker(String name, int salary, int risk) {
		super(name, salary);
		this.risk = risk;
	}
	
	@Override
	public int getSalary() {
		switch(risk) {
		case 1: 
			return super.getSalary() * 2;
		case 2:
			return (int) (super.getSalary() * 1.5);
		default:
			return (int) (super.getSalary() * 1.2);
		}
	}
	
	@Override
	public void printEmployeeInfo() {
		System.out.println(name + " / " + getSalary());
	}

}
