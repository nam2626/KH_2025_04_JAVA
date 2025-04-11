
public class E10_Quest {
	/*
	 * 		삼각함수 표 출력
	 * 		각도		사인		코사인		탄젠트
	 * 		1		0.000	0.0000		0.000
	 * 		~
	 * 		90
	 * 
	 */
	public static void main(String[] args) {
		for(int i=1;i<=90;i++) {
			double radians = Math.toRadians(i);
//			System.out.println(i + " " + Math.sin(radians) + 
//					" " + Math.cos(radians) + " " + Math.tan(radians));
			if(i < 90)
				System.out.printf("%4d %10.4f %10.4f %10.4f\n",
					i,Math.sin(radians),Math.cos(radians),Math.tan(radians));
			else
				System.out.printf("%4d %10.4f %10.4f\n",
						i,Math.sin(radians),Math.cos(radians));
				
		}
	}

}









