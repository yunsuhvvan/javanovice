package oop2;
//	[7-23] 문제7-22에서 정의한 클래스들의 면적을 구하는 메서드를 작성하고 테스트 하시
//	오.
//	1. 메서드명 : sumArea
//	기 능 : 주어진 배열에 담긴 도형들의 넓이를 모두 더해서 반환한다.
//	반환타입 : double
//	매개변수 : Shape1[] arr

abstract class Shape1 {
	Point1 p;   	//  선언


	
	Shape1() {               
		this(new Point1(0,0));      //Shape1() {
									//Point1 p = new Point1(0,0);
									//this(p);
	}




Shape1(Point1 p) {
	this.p = p;   
}

abstract double calcArea(); // 도형의 면적을 계산해서 반환하는 메서드
Point1 getPosition() {
	return p;
}
void setPosition(Point1 p) {
	this.p = p;
}
}

class Circle1 extends Shape1{ 
	double r; // 반지름
	Circle1(double r) {
		this(new Point1(0,0),r); // Circle1(Point1 p, double r)를 호출
	}
	Circle1(Point1 p, double r) {
		super(p); // . 조상의 멤버는 조상의 생성자가 초기화하도록 한다
		this.r = r;
	}
	double calcArea() {
		return Math.PI * r * r;
	}
}

class Rectangle1 extends Shape1{

	double width;
	double height;


	Rectangle1(double width, double height) {
		this(new Point1(0,0), width, height);
	}


	Rectangle1(Point1 p, double width, double height) {
		super(p); // . 조상의 멤버는 조상의 생성자가 초기화하도록 한다
		this.width = width;
		this.height = height;
	}

	boolean isSquare() {
		// width height 0 width height true . 나 가 이 아니고 와 가 같으면 를 반환한다
		return width*height!=0 && width==height;
	}
	double calcArea() {
		return width * height;
	}
}


class Point1 {
	int x;
	int y;
	Point1() {
		this(0,0);
	}
	Point1(int x, int y) {
		this.x=x;
		this.y=y;
	}
	public String toString() {
		return "["+x+","+y+"]";
	}
}




public class Ex_07_23 {

	static double sumArea(Shape1[] arr) {
		double sum = 0;
		for(int i=0; i < arr.length;i++)
		sum+= arr[i].calcArea();
		return sum;
	}
	
	public static void main(String[] args) {

		Shape1[] arr = {new Circle1(5.0), new Rectangle1(3,4), new Circle1(1)};
		System.out.println(" :"+sumArea(arr)); 
	}

}
