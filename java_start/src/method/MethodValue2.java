package method;

public class MethodValue2 {

	public static void main(String[] args) {
		int number =5;
		System.out.println("1. changeNumber 호출 전, number: "+ number);
		changeNumber(number);
		System.out.println("4. changeNumber 호출 후, number: "+ number); //5이다. => num1의 값을 num2에 복사해서 붙여넣은 것 뿐이지 num1이 바뀌는 것은 아니다.

	}
	
	public static void changeNumber(int number) {
		System.out.println("2. changeNumber 호출 전, number: "+ number);
		number = number * 2;
		System.out.println("3. changeNumber 호출 전, number: "+ number);
	}
}

//헷갈리지 말 것 => 각가의 메서드 안에서 사용하느 변수는 서로 완전히 분리된 다른 변수이다. 이름이 같아도 완전히 다른 변수이다.