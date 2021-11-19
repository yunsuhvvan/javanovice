package oop;
class Car3 {
	
	// 멤버변수는 초기화하지 않아도 자동적으로 변수의 자료형에 맞는 기본값으로 초기화가 된다
	// 지역변수는 사용하기 전에 반드시 초기화 해야한다.ㅕㅓ
	String color;		// 색상
	String gearType;    // 변속기 종류 - auto (자동), manual(수동)
	int door;			// 문의 개수

	Car3() {
		this("white", "auto", 5); // 생성자간의 호출에서는 생성자 이름 대신 this를 사용해야만 한다.
	}

	Car3(Car3 c1) {	// 인스턴스의 복사를 위한 생성자
		color    = c1.color;
		gearType = c1.gearType;
		door     = c1.door;
	}

	Car3(String color, String gearType, int door) {
		this.color    = color;
		this.gearType = gearType;
		this.door     = door;
	}
}
class CarTest3 {
	public static void main(String[] args) {
		Car3 c1 = new Car3();
		Car3 c2 = new Car3((Car3) c1);	// c1의 복사본 c2를 생성한다.
		System.out.println("c1의 color=" + c1.color + ", gearType=" + c1.gearType+ ", door="+c1.door);
		System.out.println("c2의 color=" + c2.color + ", gearType=" + c2.gearType+ ", door="+c2.door);

		c1.door=100;	// c1의 인스턴스 변수 door의 값을 변경한다
		System.out.println("c1.door=100; 수행 후 ");
		System.out.println("c1의 color=" + c1.color + ", gearType=" + c1.gearType+ ", door="+c1.door);
		System.out.println("c2의 color=" + c2.color + ", gearType=" + c2.gearType+ ", door="+c2.door);
	}
}

// ※생성자를 이용한 인스턴스 복사이다 .

// 나중에 들어올 Car3 타입의 인자를 c로 받겠다는 것 일뿐이다.
// 나중에 사용을 위해서  미리 선언만 해둔 것임 
// new 로 인해 별개의 주소값을 가지게 되며, 독립적이고 c1을 바꾼다해서 c2에 영향이 없다.
// 필요한 상황에 맞게 사용을 해야될것이다..
// 매개변수로 넘겨진 c가 가리키는 car 인스턴스의 변수를 가리키게된다


// ※this 는 참조변수로 인스턴스 자신을 가르킨다.  this라는 참조변수를 통해 인스턴스 멤버에 접근할 수 있다.
// ※static 메서드는 this 를 사용할 수 없음 (static 메서드가 호출된 시점에 인스턴스가 존재하지 않을 수 있기때문)

/*
 * 나의 생각
 * 
 * 매개변수가 1개인 생성자는 "Car3(Car3 c1)"이고 , 이 생성자는 인자로 c1를 받았는데, 
 * c1은 
 *  Car3() {
 *		this("white", "auto", 5); 이다 
 * 
 *  Car3 c2 = new Car3(c1); 
 * "Car3(매개변수가 있는 생성자)" 의 타입은 참조형이고 참조형 매개변수는 원본의 주소를 가르킬 수 있고 
 * 값도 변경할 수 있지만  c2는 new로 인해 heap영역(?) 별도의 공간에 올려지기때문에 서로 독립적임
 * 
 * 
 * */


