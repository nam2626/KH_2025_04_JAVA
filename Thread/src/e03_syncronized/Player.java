package e03_syncronized;

public class Player extends Thread{
	@Override
	public void run() {
		System.out.println(getName() + " : " 
					+ Bank.getInstance().withdraw(1000));
	}
}
