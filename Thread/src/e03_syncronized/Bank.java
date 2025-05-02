package e03_syncronized;

public class Bank {
	private static Bank instance = new Bank();
	private int money;
	
	private Bank() {
		money = 2000;
	}

	public static Bank getInstance() {
		if(instance == null)
			instance = new Bank();
		return instance;
	}
	
	public int withdraw(int m) {
		money -= m;
		return money;
	}
	
}



