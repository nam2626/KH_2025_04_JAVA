package e03_super;

public class Avante {
	protected int fuel;
	protected int speed;
	
	public Avante() {
		fuel = 100;
	}
	
	public void accerate() {
		if(fuel < 1) {
			System.out.println("연료를 채워 주세요.");
			return;
		}

		if(speed + 5 <= 240)
			speed += 5;
		fuel--;
		System.out.println("엑셀을 밟습니다.");
		System.out.println(
				String.format("현재 속도 : %dkm/h - 남은 연료 : %d",
						speed, fuel));
	}
	
	public void brake() {
		if(speed <= 10) speed = 0;
		else speed -= 10;
		System.out.println("브레이크를 밟습니다.");
		System.out.println(
				String.format("현재 속도 : %dkm/h - 남은 연료 : %d",
						speed, fuel));
	}
		
}




