package e01_init;

import java.text.SimpleDateFormat;
import java.util.Date;

public class RunnableRun implements Runnable {
	private String name;
	
	public RunnableRun(String name) {
		this.name = name;
	}

	@Override
	public void run() {
		for(int i=0;i<1_000_000_000;i++);
		System.out.println(name + " - 종료 " 
					+ System.currentTimeMillis());
	}

}
