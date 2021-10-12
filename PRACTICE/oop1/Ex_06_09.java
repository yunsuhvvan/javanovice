package oop1;
//다음은 컴퓨터 게임의 병사를 (marine)클래스로 정의한 것이다 이 클래스의 멤버 
//중에 static을 붙여야 하는 것은 어떤 것들이고 그 이유는 무엇인가  ?
// 단, 모든 병사의 공격력과 방어력은 같아야 한다.



class Marine {

	int x=0, y=0; // Marine (x,y) 의 위치좌표
	int hp = 60; // 현재 체력
	static	int weapon = 6; // 공격력
	static	int armor = 0; // 방어력
	
	
	// 현재 체력과 현재 위치는 계속 달라질 것 이므로.
	// 공격력과 방어력은 계속 같은 공통 속성이므로 .. 

	static void weaponUp() {
		weapon++;          //cv를 사용하기 위해서는 static을 붙혀야 한다.
	}

	static void armorUp() {
		armor++;           //cv를 사용하기 위해서는 static을 붙혀야 한다.
	}

	void move(int x, int y) {
		this.x = x;
		this.y = y;
	}
}
