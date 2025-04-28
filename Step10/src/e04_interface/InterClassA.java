package e04_interface;

public class InterClassA implements InterA {

	@Override
	public void interA() {
		System.out.println("InterClassA - interA");
	}

	@Override
	public void interA1() {
		System.out.println("InterClassA - interA1");
	}

}
