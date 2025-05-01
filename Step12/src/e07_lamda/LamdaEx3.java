package e07_lamda;

public class LamdaEx3 {
	public static <T> void run(Method<T> m, T v1, T v2) {
		System.out.println(m.run(v1, v2));
	}
	public static void main(String[] args) {
		Method<Double> m1 = (a,b) -> a+b;
		Method<Integer> m2 = (a,b) -> a+b;
		Method<String> m3 = (a,b) -> a+b;
		
		run(m1,10.33,2.13);
		run(m2,10,2);
		run(m3,"Hello","World");
		run((x,y) -> x + y,"5","6");
		
	}
}
