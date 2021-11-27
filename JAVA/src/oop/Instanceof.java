package oop;

//	메서드명 : action
//	기 능 : 주어진 객체의 메서드를 호출한다.
//	DanceRobot인 경우, dance()를 호출하고,
//	SingRobot인 경우, sing()을 호출하고,
//	DrawRobot인 경우, draw()를 호출한다.
//	반환타입 : 없음
//	매개변수 : Robot r - Robot인스턴스 또는 Robot의 자손 인스턴스
//	

	
	class Robot {}

	class DanceRobot extends Robot {
		void dance() {
			System.out.println("춤을 춥니다.");
		}
	}
	
	class SingRobot extends Robot {
		void sing() {
			System.out.println("노래를 합니다.");
		}
	}
	
	class DrawRobot extends Robot {
		void draw() {
			System.out.println("그림을 그립니다.");
		}
	}


public class Instanceof {
	
	public static void action(Robot r) {
		
		if(r instanceof DanceRobot) {    // robot r로   DanceRobot 을 ..가리킬 수 있냐?
			DanceRobot dancer = (DanceRobot)r; //  조상 -> 자손 downcasting
			dancer.dance();
		} 
		if(r instanceof SingRobot) {
			SingRobot singer = (SingRobot)r;
			singer.sing();
		}
		if(r instanceof DrawRobot) {
			DrawRobot Drawer = (DrawRobot)r;
			Drawer.draw();
		}
	}

	public static void main(String[] args) {
		
			Robot[] arr = { new DanceRobot(), new SingRobot(), new DrawRobot()};
			for(int i=0; i< arr.length;i++)
			action(arr[i]);
	}

}
//자손타입 <- 조상타입 참조변수 형변환 (downcasting)은  되긴 하지만 형변환 생략불가
