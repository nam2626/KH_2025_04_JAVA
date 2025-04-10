
public class E10_BookQuest1 {

	public static void main(String[] args) {
		int num1 = 10, num2 = 2;
		char operator = '%';
		
		if(operator == '+')
			System.out.println(num1 + num2);
		else if(operator == '-')
			System.out.println(num1 - num2);
		else if(operator == '*')
			System.out.println(num1 * num2);
		else if(operator == '/')
			System.out.println(num1 / num2);
		else if(operator == '%')
			System.out.println(num1 % num2);
		else
			System.out.println("잘못된 연산자 입니다.");
		
		//------------------------
		switch(operator) {
		case '+':
			System.out.println(num1 + num2);
			break;
		case '-':
			System.out.println(num1 - num2);
			break;
		case '*':
			System.out.println(num1 * num2);
			break;
		case '/':
			System.out.println(num1 / num2);
			break;
		case '%':
			System.out.println(num1 % num2);
			break;
		default:
			System.out.println("잘못된 연산자 입니다.");
		}
		
		
	}

}
