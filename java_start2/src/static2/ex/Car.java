package static2.ex;

public class Car {
	private static int totalCars; //누적을 해야하기 때문에 static
	private String name;
	
	//디폴트 생성자는 void 안붙음. => class에서 class만 빠진다고 생각.
	public Car(String name) {
		System.out.println("차량 구입, 이름: " + name);
		this.name = name;
		totalCars++;
	}
	//클래스에서 불러왔기 때문에 static
	public static void showTotalCars() {
		System.out.println("구매한 차량 수: " + totalCars);
	}
}
