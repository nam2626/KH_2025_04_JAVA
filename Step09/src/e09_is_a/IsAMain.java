package e09_is_a;

public class IsAMain {

	public static void main(String[] args) {
		Person p = new Person();
		Dog d = new Dog();
		
		p.eat();
		d.eat();
		
		Animal a = p;
		a.eat();
		System.out.println(System.identityHashCode(a));
		System.out.println(System.identityHashCode(p));
		System.out.println(a);
		System.out.println(p);
		System.out.println();
		a = d;
		a.eat();
		System.out.println(System.identityHashCode(a));
		System.out.println(System.identityHashCode(d));
		System.out.println(a);
		System.out.println(d);
		System.out.println();
		
		a = p;
		//다운 캐스팅
		Person pe = (Person) a;
		System.out.println(a);
		System.out.println(p);
		System.out.println(pe);
		
		//에러가 발생하는 부분
		//부모 자식 관계상 자식이 부모, 부모가 자식으로 형변환이 되지만
		//부모가 자식이 되는 경우 주의할 점으로는
		//원래 자식에서 다른 자식으로 형변환이 시도되면 런타임 오류가 발생
		a = p;
		Dog d1 = (Dog) a;
		System.out.println(a);
		System.out.println(p);
		System.out.println(d1);
	}

}





