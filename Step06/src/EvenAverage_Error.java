import java.util.Scanner;

/*
 *  제공된 코드는 양수 중 짝수의 평균을 구하기
 * 	정수 10개를 입력 받아서 배열에 저장한뒤,
 * 	그 중에 양수이면서 짝수인 수들만 골라서 평균을 출력하는 프로그램을 작성하시오.
 * 	만약 양수인 짝수가 하나도 없다면 "결과 없음" 출력하는 코드입니다.
 * 	해당 코드에 문제가 생겨서 정상적을 동작하지 않습니다.
 * 	해당 에러를 쓰고, 수정한 코드를 답으로 제출
 *  
 */

public class EvenAverage_Error {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int[] nums = new int[10];
        int sum = 0;
        int count = 0;

        for(int i = 0; i < nums.length; i++) { 
            System.out.print("정수 입력: ");
            nums[i] = sc.nextInt();
        }

        for(int i = 0; i < nums.length; i++) {
            if(nums[i] > 0 && nums[i] % 2 != 1) { 
                sum += nums[i]; 
                count++;       
            }
        }

        if(count > 0) {  
            System.out.println("짝수 평균: " + sum / count);  
        }
    }
}
