package poly.ex2;

public class AnimalPolyMain2 {

	public static void main(String[] args) {
		Dog dog = new Dog();
		Cat cat = new Cat();
		Caw caw = new Caw();
		Animal[] animalArr = {dog, cat, caw};
		
		for(int i = 0; i<animalArr.length; i++) {
			System.out.println("동물 소리 테스트 시작");
			animalArr[i].sound();
			System.out.println("동물 소리 테스트 종료");
		}
	}

	
}
