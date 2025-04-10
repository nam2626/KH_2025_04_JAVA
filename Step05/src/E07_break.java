
public class E07_break {
	/*
	 * 	break
	 * 		break는 break를 직접 감싸고 있는 반복문 및 switch문 1개만 종료
	 * 		일반적으로는 if문과 같이 사용
	 * 		(특정 조건을 만족하였을 때 종료하기 위해서)
	 * 
	 */
	public static void main(String[] args) {
		for(int i=1;i<=50;i++) {
			//i가 25가 되면 멈추겠다.
			if(i == 25) 
				break;
			System.out.println(i);
		}
	}

}


