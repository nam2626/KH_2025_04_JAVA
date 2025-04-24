package e03_super;

public class AvanteN extends Avante{
	private boolean driveMode;//false - 일반, true - 고속 주행
	
	public void changeMode() {
		driveMode = !driveMode;
		
		if(driveMode)
			System.out.println("고속 주행 모드로 전환합니다.");
		else
			System.out.println("일반 주행 모드로 전환합니다.");
	}
	
	@Override
	public void accerate() {
		if(driveMode) {
			//고속 주행 모드면 속도는 15 증가, 연료량 3씩 소모
			if(fuel < 3) {
				System.out.println("연료를 채워 주세요.");
				return;
			}
	
			if(speed + 15 <= 240)
				speed += 15;
			fuel -= 3;
			System.out.println("엑셀을 밟습니다.");
			System.out.println(
					String.format("현재 속도 : %dkm/h - 남은 연료 : %d",
							speed, fuel));
		}else {
			super.accerate();
		}
	}
	
}
