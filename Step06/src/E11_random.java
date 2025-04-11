
public class E11_random {
	//(int)(Math.random() * (최대값 - 최소값 + 1)) + 최소값
	public static void main(String[] args) {
		//0 <= x < 1
		System.out.println(Math.random());
		
		//1 ~ 10
		for(int i=0;i<10;i++) {
			int n = (int)(Math.random() * 10)+1;
			System.out.print(n + " ");
		}
		System.out.println();
		//7~15
		for(int i=0;i<10;i++) {
			int n = (int)(Math.random() * 9)+7;
			System.out.print(n + " ");
		}
		System.out.println();
		
		//로또번호 6개 출력 1~45 <-- 중복 X
		for(int i = 0; i < 6; i++) {
			int n = (int)(Math.random() * 45) + 1;
			System.out.print(n + " ");
		}
	}

}


