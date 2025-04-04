import java.util.Scanner;

public class E21_Quest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//상품의 원가와 할인율을 입력받아서, 할인된 가격을 계산해서 출력
		System.out.print("원가 입력 : ");
		int price = sc.nextInt();
	
		System.out.print("할인율 입력 : ");
		int ratio = sc.nextInt();
		
		//할인된 가격을 출력 -> 할인된 가격 = 원가 - (원가 * 할인율 / 100)
		
		//할인된 가격이 5000원 이상이면 "적당한 가격" 아니면 "더 할인해 주세요" 출력
		
		//할인율이 50% 이상이면 "세일을 많이 하네요!" 출력
	}

}
