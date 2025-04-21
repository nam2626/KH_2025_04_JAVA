package e05_array_class;

public class Product {
	private String name;
	private int price;

	public Product(String name, int price) {
		this.name = name;
		this.price = price;
	}
	
	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "상품명 : " + name + ", 가격 : " + price;
	}
	
	
}	
