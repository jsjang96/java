package poly.car1.practice;

public class Driver{

	private Car car;
	
	public void setCar(Car car) {
		System.out.println("차를 설정합니다.");
		this.car = car;
	}
	
	public void drive() {
		System.out.println("차를 운전합니다.");
		car.startEngine();
		car.offEngine();
		car.pressAccelerator();
	}
}
