package oop;
// class Data { int x; }

class ReferenceParamEx {
	public static void main(String[] args) {

		Data d = new Data();
		d.x = 10;
		System.out.println("main() : x = " + d.x);

		change(d);
		System.out.println("After change(d)");
		System.out.println("main() : x = " + d.x);

	}

	static void change(Data d) { // 참조형 매개변수
		d.x = 1000;
		System.out.println("change() : x = " + d.x); 
	}
}

/*
 * 
 *  1. main안에서 change 메서드가 호출 되면서  이전 기본형 매개변수처럼 10으로 명시적 초기화가 된 d.x가 아닌
 *  참조변수"d(0x100)"(리모컨,객체)가 전달됨으로써 change의 "d"도 0x100을 갖게 되었다.
 *  
 *  2. 같은 주소를 갖게되면서 같은 x를 가리킬 수 있게 되면서 x가 1000이 된다 
 *  
 *  3. 호출스택에 있는 change 메서드가 종료되면서 할당 되었던 메모리공간은 반환 되어 비워져도
 *    	변경된 값으로 출력이 가능하다.
 *  ♣♣참조형이라서 값이 아니라 주소 값을 보내주기때문에 읽어오는 것과 변경하는 것이 가능하다♣♣
 *  
 *  
 *  참조형 반환 타입
 *  
 *  1) 모든 참조형의 타입은 객체의 주소이다
 *  2)  public List<EmpDto> selectEmpList(){}; 메서드의 반환 타입이 List<EmpDto>이므로 
 *  	다른 곳에서 이 메서드를 호출하여 변수에 저장한다면 타입 역시 List 타입의 참조변수여야한다.
 *  ♣♣ 반환 타입이 "참조형"이라는 것은 메서드가 '객체의 주소'를 반환한다는 것을 의미한다.♣♣
 * 
 * 
 * 
 * 
 */
