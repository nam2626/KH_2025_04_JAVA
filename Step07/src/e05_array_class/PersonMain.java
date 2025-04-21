package e05_array_class;

public class PersonMain {

	public static void main(String[] args) {
		Person[] arr = new Person[3];
		
		arr[0] = new Person("김씨", 20);
		arr[1] = new Person("이씨", 30);
		arr[2] = new Person("박씨", 40);
		
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}

}





