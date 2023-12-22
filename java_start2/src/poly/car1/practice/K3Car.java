package poly.car1.practice;

public class K3Car implements Car{
	
	@Override
	public void startEngine() {
		System.out.println("K3Car 시동을 켭니다.");
	}
	
	@Override
	public void offEngine() {
		System.out.println("K3Car 시동을 끕니다.");
	}
	
	@Override
	public void pressAccelerator() {
		System.out.println("K3Car 엑셀을 밟습니다.");
	}
	
}
