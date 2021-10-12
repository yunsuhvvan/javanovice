package oop1;

public class Ex_06_07 {

	public static void main(String[] args) {



		MyPoint p = new MyPoint(1,1);    
		// p와 (2,2)의 거리를 구한다
		System.out.println(p.getDistance(2,2));


	}

}

class MyPoint {
	int x;
	int y;
	MyPoint(int x, int y) {
		this.x = x;  // 참조변수 this는 자기 자신을 가르키기 때문에 iv에 접근할 수 있다
		this.y = y;
	}
	// 코드
	double getDistance(int x1, int y1){  //lv는 매서드에서 한번 실행되면 소멸
		return Math.sqrt((this.x-x1)*(this.x-x1) + (this.y-y1)*(this.y-y1));
	}

}

