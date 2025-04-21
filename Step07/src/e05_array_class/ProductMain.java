package e05_array_class;

public class ProductMain {

	public static void main(String[] args) {
		Product[] arr = new Product[3];
		
		arr[0] = new Product("아이폰15", 160);
		arr[1] = new Product("갤럭시S25", 145);
		arr[2] = new Product("LG OLED TV", 300);
		
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		
		for(Product p : arr) {
			System.out.println(p);
		}
	}

}

