package oop1.ex;

public class ReactangleOopMain {

	public static void main(String[] args) {
		Rectangle rectangle = new Rectangle();
		rectangle.width = 6;
		rectangle.height = 5;
//		rectangle.area();
//		rectangle.perimeter();
//		rectangle.square();
		int area = rectangle.area();
		System.out.println("넓이: " + area);
		
		int perimeter = rectangle.perimeter();
		System.out.println("둘레: " + perimeter);
		
		boolean square = rectangle.square();
		System.out.println("정사각형 여부: " + square);
	}

}
