package e05_array_class;

public class Counter {
	private int count;
	
	public void increase() {
		count++; 
	}

	@Override
	public String toString() {
		return "count : " + count;
	}
	
}
