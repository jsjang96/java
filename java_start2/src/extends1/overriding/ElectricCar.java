package extends1.overriding;

public class ElectricCar extends Car {

	@Override //컴파일 오류를 내는 어노테이션(오버라이드가 안됐을 시)
	public void move() {
		System.out.println("전기차를 빠르게 이동합니다.");
	}
	
	public void charge() {
		System.out.println("충전합니다.");
	}
}
