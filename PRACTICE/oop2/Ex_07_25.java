package oop2;

class Outer {
	class Inner {
		int iv=100;
	}
}


public class Ex_07_25 {

	public static void main(String[] args) {

		
		Outer x = new Outer();   // 외부클래스 객체를 먼저 만들고
		Outer.Inner y = x.new Inner();     // inner class 사용하기 위해서 객체를 만든다.
		System.out.println(y.iv);
	
	}

}
