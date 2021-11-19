package oop;
class Data { int x; }

class PrimitiveParamEx {
	public static void main(String[] args) {
		Data d = new Data();
		d.x = 10; 
		System.out.println("main() : x = " + d.x); // 10

		change(d.x); 
		System.out.println("After change(d.x)");
		System.out.println("main() : x = " + d.x);
	}

	static void change(int x) { 
		x = 1000;
		System.out.println("change() : x = " + x);
	}
}
 /* 
  * 기본형 매개변수  : 변수의 값을 읽기만 할 수 있다 (read only)
  * 참조형 매개변수 : 변수의 값을 읽고 변경할 수 있다 (read and write)
	
	기본형 매개변수는 변수에 저장된 값만 읽을 수만 있을 뿐 변경할 수 없다.
	
  * 1. change 메서드가 호출 되면서  change메서드에 매개변수 전달
  * 2. 매개변수가 전달되고 main의 x=10이 복사되어  change의 x가 10으로 변경이 된다
  * 3. 하지만 change 메서드가 호출 되고 메서드 내부 x가 1000으로 다시 초기화 
  * 4.  원본의 값을 복사본으로 보내는 것이기 떄문에  change메서드가 종료되면 main의 x에게 아무런 영향이없다.
  */
