package oop2;

class Outerr {
	int value=10;
	
	class Innerr {
		int value=20;
		
		void method1() {
			int value=30;
			System.out.println(value);
			System.out.println(this.value);     
			System.out.println(Outerr.this.value);
		}
	} // Innerr클래스의 끝
} // Outerr클래스의 끝


public class Ex_07_27 {

	public static void main(String[] args) {
		
		Outerr outer = new Outerr();   
		Outerr.Innerr inner =  outer.new Innerr();

		inner.method1();


	}

}


 

//실행결과
//30
//20
//10