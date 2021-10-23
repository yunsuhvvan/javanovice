package oop2;

abstract class Unit{
	int x, y; // 현재 위치
	abstract void move(int x, int y);  //공통적으로 필요하지만 자손마다 다르게 구현될 경우에!
	void stop() {}
}
	
	
class Marine extends Unit{ // 상속은 생성자랑 초기화블럭은 상속이 되지 않는다
		void move(int x, int y) {}
		void stimPack() {}
	}
class Tank extends Unit{ // 탱크
		void move(int x, int y) {}
		void changeMode() {}
	}
class Dropship extends Unit{ // 수송선
		void move(int x, int y) {}
		void load() {}
		void unload() {}
	}

public class Ex_07_17 {

	public static void main(String[] args) {

	}

}
