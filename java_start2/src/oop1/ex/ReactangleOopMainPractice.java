package oop1.ex;

public class ReactangleOopMainPractice {

	public static void main(String[] args) {
		RectanglePractice rectangle = new RectanglePractice();
		rectangle.width = 5;
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
