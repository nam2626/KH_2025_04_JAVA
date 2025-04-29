package e01_generic;

public class BoxMain {

	public static void main(String[] args) {
		Box box = new Box();
		
		box.setObj(300);
		System.out.println(box.getObj());
		//Object로 형변환된 후에는 어떤 타입인지 몰라서 계산이 안됨
//		System.out.println(box.getObj() * 3);
		//Object로 데이터를 관리하면 반드시 형변환 작업 후 계산
		System.out.println((int)box.getObj() * 3);
		
		box.setObj(new Person());
//		box.getObj().eat();//X 타입 Object라서 불가능
		((Person) box.getObj()).eat();//형변환 후에 처리 가능
		
		//매번 저장은 상관이 없지만, 
		//꺼내서 사용할 때는 형변환 과정을 반드시 거쳐야함
	}

}
