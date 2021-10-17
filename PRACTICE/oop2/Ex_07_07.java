package oop2;


//[7-7] 다음 코드의 실행했을 때 호출되는 생성자의 순서와 실행결과를 적으시오.


class Parent {
	int x=100;
	Parent() {      //4.Parent(){this(200)} -> Parent(int x) 호출
		this(200);
	}
	Parent(int x) {   //5. 생성자가 없기때문에  super();로 조상(object) 호출
		this.x = x;//  6.this.x = 200
	}
	int getX() {
		return x; //7. x = 200
	}
}
class Child extends Parent {
	int x = 3000;
	Child() {          //1. new Child(); - > Child()  - > this(1000) 이 Child(int x)호출  
		this(1000);
	}
	Child(int x) {
		super();     // 2. 생성자 첫줄에 반드시 조상의 생성자를 호출해서 초기화해야한다
		this.x = x;    //3. this.x =1000; 
		
	}
}



public class Ex_07_07 {

	public static void main(String[] args) {

		Child c = new Child();
		System.out.println("x="+c.getX());
		
	}

}
