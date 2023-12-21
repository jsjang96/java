package poly.basic;


//upcasting vs downcasting
public class CastingMain3 {

	public static void main(String[] args) {
		Child child = new Child();
		Parent parent1 = child; // (Parent) child 다른 타입에 들어갈 땐 무조건 캐스팅 해야한다. 하지만 업 캐스팅은 생략 가능, 생략 권장
		Parent parent2 = child; //업캐스팅 생략
		
		parent1.parentMethod();
		parent2.parentMethod();
		
	}

}
