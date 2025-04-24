package e01_extends;

public class AnimalMain {

	public static void main(String[] args) {
		Human human = new Human("홍길동");
		
		human.eat();
		human.printInfo();
		
		Animal animal = new Animal();
		//protected 접근제어자는 같은 패키지까지도 접근 가능
		System.out.println(animal.age);
		
		Dog dog = new Dog();
		dog.eat();
	}

}


