package scope;

public class Scope1 {

	public static void main(String[] args) {
		int m = 10; //m생존 시작
		if(true) {
			int x = 20; //x생존 시작
			System.out.println("if m= " + m);
			System.out.println("if x= " + x);
		} //x생존 종료
		System.out.println("main m=" +m);

	}//m생존 종료

}
