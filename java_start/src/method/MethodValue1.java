package method;

public class MethodValue1 {

	public static void main(String[] args) {
		int num1 =5;
		System.out.println("1. changeNumber 호출 전, num1: "+ num1);
		changeNumber(num1);
		System.out.println("4. changeNumber 호출 후, num1: "+ num1); //5이다. => num1의 값을 num2에 복사해서 붙여넣은 것 뿐이지 num1이 바뀌는 것은 아니다.

	}
	
	public static void changeNumber(int num2) {
		System.out.println("2. changeNumber 호출 전, num2: "+ num2);
		num2 = num2 * 2;
		System.out.println("3. changeNumber 호출 전, num2: "+ num2);
	}
}
