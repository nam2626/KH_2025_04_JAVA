package e04_join;

public class JoinMain {

	public static void main(String[] args) {
		JoinThread j1 = new JoinThread("Join 스레드 - 1");
		JoinThread j2 = new JoinThread("Join 스레드 - 2");
		JoinThread j3 = new JoinThread("Join 스레드 - 3");
		
		j1.start();
		j2.start();
		j3.start();
		
		try {
			j1.join(5000);//join1의 작업을 5초동안만 기달리겠다.
			j2.join();
			j3.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("main 종료");
	}

}




