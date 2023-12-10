package oop1.ex;

public class Rectangle {
	int width;
	int height;
	
	int area() {
		return width * height;
	}
//	void area() {
//		int area = width * height;
//		System.out.println(area);
//	}
	
	int perimeter() {
		return 2*(width+height);
	}
	
	boolean square() {
		return width == height;
	}
//	void perimeter(){
//		int perimeter = 2*(width+height);
//		System.out.println(perimeter);
//	}
//	
//	void square(){
//		if(width == height) {
//			System.out.println("정사각형 여부: True" );
//		}else
//			System.out.println("정사각형 여부: False" );
//	}
}
