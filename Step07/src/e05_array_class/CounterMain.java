package e05_array_class;

public class CounterMain {
	public static void increasCount(Counter count) {
		count.increase();
		System.out.println(count);
	}
	public static void main(String[] args) {
		Counter[] arr = new Counter[4];
		
		for (int i = 0; i < arr.length; i++) 
			arr[i] = new Counter();
		
		increasCount(arr[2]);
		increasCount(arr[2]);
		increasCount(arr[2]);
		
		for (Counter counter : arr) {
			System.out.println(counter);
		}
	}

}
