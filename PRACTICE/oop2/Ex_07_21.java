package oop2;

public class Ex_07_21 {

	// 다음과 같이 attack 메서드가 정의되어 있을때 이 메서드의 매개변수로 가능한 것
	// 두가지를 적으시오

	interface Movable {
		void move(int x, int y);
	}
	void attack(Movable f) {  //Movable을 구현한 것만 들어올 수 있다.
		/*  내용 생략 */
	}

}
//
// 답 : 메서드 attack은 Movable을 구현하지 않았기 때문에 매개변수로 들어올 수 있는 것은 없다.
	