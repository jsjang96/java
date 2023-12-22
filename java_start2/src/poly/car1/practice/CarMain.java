package poly.car1.practice;

public class CarMain {

	public static void main(String[] args) {
		
		Driver driver = new Driver();
		
		//차 설정
		K3Car k3Car = new K3Car();
		driver.setCar(k3Car);
		driver.drive();
		
		//차 변경
		Model3Car model3Car = new Model3Car();
		driver.setCar(model3Car);
		driver.drive();

	}

}
