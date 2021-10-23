package oop2;
//
//[7-15] 클래스가 다음과 같이 정의되어 있을 때, 형변환을 올바르게 하지 않은 것은?
//(모두 고르시오.)

			//	class AirUnit extends Unit {}
			//	class GroundUnit extends Unit {}
			//	class Tank extends GroundUnit {}
			//	class AirCraft extends AirUnit {}
			//	
			//	Unit u = new GroundUnit();
			//	Tank t = new Tank();
			//	AirCraft ac = new AirCraft();
			//

//			a. u = (Unit)ac;
//			b. u = ac;
//			c. GroundUnit gu = (GroundUnit)u;
//			d. AirUnit au = ac;
//			e. t = (Tank)u;
//			f. GroundUnit gu = t;


// 답안 e 다형성, 조상타입의 참조변수로 자식 


public class Ex_07_15 {

	public static void main(String[] args) {

		
		
	}

}
