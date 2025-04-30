package e03_inner;

public class OutterClass {
	private int outter;

	public OutterClass(int outter) {
		this.outter = outter;
	}
	
	public void printOutter() {
		System.out.println("outter : " + outter);
	}
	
	public class Inner{
		private int inner;

		public Inner(int inner) {
			this.inner = inner;
		}
		
		public int sum() {
			return outter + inner;
		}
		
		public void printInner() {
			//Outter 클래스의 private 멤버에 접근이 가능
			System.out.println(outter + " -> " + inner);
		}
		
	}
}
