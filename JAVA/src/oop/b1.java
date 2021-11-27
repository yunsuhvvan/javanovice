package oop;


//			class Marine { // 보병
//			int x, y; // 현재 위치
//			void move(int x, int y) { /* 지정된 위치로 이동*/ } 
//			void stop() { /*현재 위치에 정지 */ } 
//			void stimPack() { /* 스팀팩을 사용한다 .*/}
//			}
//			class Tank { // 탱크
//			int x, y; // 현재 위치
//			void move(int x, int y) { /*지정된 위치로 이동 */ } 
//			void stop() { /*현재 위치에 정지 */ } 
//			void changeMode() { /*공격모드를 변환한다 . */} 
//			}
//			class Dropship { // 수송선
//			int x, y; // 현재 위치
//			void move(int x, int y) { /*지정된 위치로 이동 */ } 
//			void stop() { /* 현재 위치에 정지 */ }
//			void load() { /*선택된 대상을 태운다 .*/ } 
//			void unload() { /*선택된 대상을 내린다 .*/ } 
//			}



abstract class Unit{
	
	int x, y; // 현재 위치
	
	// 조상 클래스에서는 선언부만 작성하고 주석을 덧붙혀 어떤 기능을 수행할 목적으로 작성 되었는지 알려줘ㅇ야함.
	abstract void move(int x, int y);  //공통적으로 필요하지만 자손마다 다르게 구현될 경우에!
	
	void stop() {}   // 추상메서드가 아니다
}



// 추상 클래스로부터 상속 받는 자손 클래스는 오버라이딩을 통해 조상인 추상 클래스의 추상메서드를 모두 구현 해줘야한다.
// 만일 조상으로부터 상속 받은 추상메서드 중 하나라도 구현하지 않는다면 자손클래스 역시 추상 클래스로 지정해줘야함.

class Marine extends Unit{ // 상속은 생성자랑 초기화블럭은 상속이 되지 않는다
		void move(int x, int y) {
			System.out.println("Marine이 x="+x+ " 만큼 , y="+y+" 만큼 이동했습니다"  );
		}
		void stimPack() {}  
	}
class Tank extends Unit{ // 탱크
		void move(int x, int y) {
			System.out.println("Tank가 x="+x+ " 만큼 , y="+y+" 만큼 이동했습니다"  );

		}
		void changeMode() {}
	}
class Dropship extends Unit{ // 수송선
		void move(int x, int y) {
			System.out.println("Dropship 이 x="+x+ " 만큼 , y="+y+" 만큼 이동했습니다"  );

		}
		void load() {}
		void unload() {}
	}

public class Abstract {

	public static void main(String[] args) {

		Unit[] unit = {new Marine(), new Tank(), new Dropship()};
		
			for(int i=0; i < unit.length; i++) {
				unit[i].move(200, 400); 
			}
	}
}


// 추상 클래스는 추상 메서드를 포함 하고 있다는 것을 제외하고는 일반 클래스와 전혀 다르지 않다.
// 추상 클래스에도 생성자가 있으며 멤버변수와 메서드도 다르지 않다.
