package e04_example;

public class EmployeeMain {

	public static void main(String[] args) {
		Employee emp = new Employee("홍길동", 5000);
		emp.printEmployeeInfo(); 
		emp.work(); 
		System.out.println(emp.getSalary());
		
		PartTimeWorker pt = new PartTimeWorker("김아르바", 120, 10000);
		pt.printEmployeeInfo();
		

		PermanentWorker pw = new PermanentWorker("홍길동",6000);
		pw.printEmployeeInfo();


		ForeignWorker fw = new ForeignWorker("존스미스", 3600 , 2);
		fw.printEmployeeInfo();


	}

}
