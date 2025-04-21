package e06_static;

public class Count {
	private int count;
	private static int totalCount = 0;
	
	public Count() {
		totalCount++;
		System.out.println(totalCount);
	}
	
	public void addCount() {
		count++;
		//non-static에서는 static에 언제든지 접근이 가능
		//non-static이 실행되는 시점에는 이미 static이 메모리에 생성되어있음.
		//static으로 선언된 변수나, 메서드는 1개이기 때문에
		//대상이 누군지 특정이 가능함
		totalCount++;
	}

	public static void addTotalCount() {
		totalCount++;
		//static에서는 non-static에 접근이 불가능
		//static이 실행되는 시점에 non-static은 생성이 안되어 있을수도 있고,
		//생성이 되더라도 어느 객체의 대상인지 구분이 불가능하다.
		//count++;
	}
	
	@Override
	public String toString() {
		return "count=" + count + ", totalCont="+totalCount;
	}	
}
