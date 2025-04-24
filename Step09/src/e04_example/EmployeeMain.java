package e04_example;

import java.util.ArrayList;

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
		
		System.out.println("-----------------------");
		//자식 클래스는 부모 클래스로 형변환이 가능
		Employee e = pt;
		e.printEmployeeInfo();
		System.out.println("-----------------------");
		
		ArrayList<Employee> list = new ArrayList<Employee>();
		list.add(pt);
		list.add(emp);
		list.add(fw);
		list.add(pw);
		//전체 직원 정보 출력
		for(int i = 0; i < list.size(); i++) {
			list.get(i).printEmployeeInfo();
		}
		//------------------------
		//직원들에게 지출되는 급여 총액을 출력
		int sum = 0;
		for(int i = 0; i < list.size(); i++) {
			sum += list.get(i).getSalary();
		}
		System.out.println("지급 되는 급여 총액 : " + sum);
		
		//stream api 자바 8버전부터 제공 - 지금 몰라도 됨.
		int total = list.stream()
				.mapToInt(item -> item.getSalary())
				.reduce(0, (prev, cur) -> prev + cur );
		System.out.println("지급 되는 급여 총액 : " + total);
		
	}

}




