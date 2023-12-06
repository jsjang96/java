package ref;

public class VarChange2 {

	public static void main(String[] args) {
		int a = 10;
		int b = a;
		
		System.out.println("a = "+a);
		System.out.println("b = "+b);
		
		//a변경
		a = 20; 
		//a와 b의 변수가 따로 있는데 a의 변수만 20
		System.out.println("변경 a=20");
		System.out.println("a = "+a);
		System.out.println("b = "+b);

		//b변경
		b = 30;
		System.out.println("변경 b=30");
		System.out.println("a = "+a);
		System.out.println("b = "+b);
	}

}
