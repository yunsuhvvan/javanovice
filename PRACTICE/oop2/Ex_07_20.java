package oop2;
//[7-20] 다음의 코드를 실행한 결과를 적으시오.
class Parent1 {
	int x = 100; // 중복정의 --> 멤버변수의 경우 참조변수의 타입에 따라서 달라진다
	void method() {
		System.out.println("Parent1 Method");
	}
}
class Child1 extends Parent1 {
	int x = 200; //중복정의  --> 멤버변수의 경우 참조변수의 타입에 따라서 달라진다
	void method() {
		System.out.println("Child1 Method");
	}
}

public class Ex_07_20 {

	public static void main(String[] args) {

		Parent1 p = new Child1();      //조상 타입의 참조변수로 자손 인스턴스를 가리키면 200아닌가?   --> 중복으로 정의되지 않았을때
		Child1 c = new Child1();		//
		System.out.println("p.x = " + p.x);
		p.method();   //실제 인스턴스의 메서드가 호출된다.
		System.out.println("c.x = " + c.x);
		c.method();
		//ex)부모클래스에 iv가 하나 있을 경우)
		//변수가 중복으로 정의되지 않았을때는 선택의 여지가 없기때문에 같은 값이 나온다. (ex부모클래스에 iv가 하나 있을 경우)
	}

}
