package oop;
class CastingTest1 {
	public static void main(String args[]) {
		Car car = null;
		FireEngine fe = new FireEngine();  
		FireEngine fe2 = null;

		fe.water(); 
		car = fe;    // car =(Car)fe; 에서 형변환이 생략된 형태다
//		car.water(); //  Car 타입은 water 메소드가 없다	
		fe2 = (FireEngine)car; //  자손타입 <- 조상타입
		fe2.water();
	}
}



class Car {
	String color;
	int door;

	void drive() { 		
		System.out.println("drive, Brrrr~");
	}

	void stop() {		
		System.out.println("stop!!!");	
	}
}

class FireEngine extends Car {	//소방차
	void water() {		
		System.out.println("water!!!");
	}
}

// 형변환은 참조변수의 타입을 변환하는 것이지 인스턴스를 변환하는 것은 아니기 때문에 
// 참조변수의 형변환은 인스턴스에 아무런 영향을 미치지 않는다.
// 단지 참조변수의 형변환을 통해서 참조하고 있는 인스턴스에서 사용할 수 있는 멤버의 개수(범위)를 조절하는 것 뿐이다.


// 형 변환할때 중요한 것은 실제 인스턴스가 무엇인지가 중요하다. 
// FireEngine fe = new FireEngine(); 가 사용할 수 있는 멤버는 총 5개이다
// 그렇기 때문에 fe2 = (FireEngine)car; 이 오류 없이 실행된다.


class CastingTest2 {
	public static void main(String args[]) {
		Car car = new Car();
		Car car2 = null;
		FireEngine fe = null;
  
		car.drive();
		fe = (FireEngine)car;		
		
		fe.drive();
		car2 = fe;
		car2.drive();
	}
}


// 그렇지만 위의 예제에서의 실제 인스턴스는 Car car = new Car();이다 (멤버가 4개)
// 참조변수간 형변화는  문제가 없어서 컴파일러는 오류가 없다고 생각하지만 
//  fe = (FireEngine)car;   멤버가 4개인 Car 타입 변수를  멤버가 5개인 FireEngine으로 형변환하면 
// " java.lang.ClassCastException:" 발생.


// 왜?? 참조변수간 형변환은 조상->자손 , 조상 <- 자손 다 자유롭게 할 수 있는데, 왜 오류가 나는 것일까?
// 위에 말했다싶이 중요한것은 실제 인스턴스가 중요하다. 
// 실제 인스턴스를 기준으로 잡고 그 안에서는 자유롭게 형변환 할 수 있지만
// 기준을 벗어나면 RuntimeException이 발생한다.





