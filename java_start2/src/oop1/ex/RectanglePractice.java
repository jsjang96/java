package oop1.ex;

public class RectanglePractice {
	int width;
	int height;
	
	int area() {
		return width*height;
	}

	int perimeter() {
		return 2*(width+height);
	}
	
	boolean square() {
		return width == height;
	}
}
