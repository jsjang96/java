package method;

public class MethodEx1Ref {

	public static void main(String[] args) {
		System.out.println("3개의 수의 평균은? "+ avg(1,2,3)); 
		System.out.println("3개의 수의 평균은? "+ avg(10,11,12));

	}
	public static double avg(int a, int b, int c) {
		
		int sum = a+ b+ c;
		return sum/3.0;
	}

}
