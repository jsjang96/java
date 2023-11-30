package method;

public class Method2 {

	public static void main(String[] args) {
		printHeader();
		printFooter();

	}
	//매개변수가 없거나 반환 타입이 없는 경
	public static void printHeader() {
		System.out.println("=프로그램을 시작합니다.=");
	}
	
	public static void printFooter() {
		System.out.println("=프로그램을 종료합니다.");
	}
}
