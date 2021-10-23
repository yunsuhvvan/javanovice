package oop2;

public class Ex_07_16 {

}

//		
//		[7-16] 다음 중 연산결과가 true가 아닌 것은? (모두 고르시오)
//		
//		class Car {}
//		class FireEngine extends Car implements Movable {}
//		class Ambulance extends Car {}
//		FireEngine fe = new FireEngine();
//		
//		a. fe instanceof FireEngine
//		b. fe instanceof Movable
//		c. fe instanceof Object
//		d. fe instanceof Car  
//		e. fe instanceof Ambulance
//		
		// 답안 :e 형제끼리는 형변환 불가능
		
	
//		instanceof연산자는 실제 인스턴스의 모든 조상이나 구현한 인터페이스에 대해
//		true를 반환한다.	
//		FireEngine인스턴스는 Object, Car, Movable, FireEngine타입에 대해 instanceof연산을 하면 결과로 true를 얻는다. 		
//		
//		
//		
//		
		
		