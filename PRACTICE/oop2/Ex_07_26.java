package oop2;

class Outer1 {
	static class Inner {
		int iv=200;
	}

}


public class Ex_07_26 {

	public static void main(String[] args) {

		
	
		
		Outer1.Inner x = new Outer1.Inner(); // static 이기 때문에 외부 객체를 생성안해도 된다.
		System.out.println(x.iv);  
	}

}
