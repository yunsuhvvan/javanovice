package oop;
class PointTest2 {
	public static void main(String argsp[]) {
		Point3D2 p3 = new Point3D2();  
		
	
		System.out.println("p3.x=" + p3.x);
		System.out.println("p3.y=" + p3.y);
		System.out.println("p3.z=" + p3.z);
	}
}

class Point3 {
	int x=10;	//5. super.x = 100
	int y=20;	//5. super.y = 200

	Point3(int x, int y) {

		this.x = x;
		this.y = y;
	}
}

class Point3D2 extends Point3 {
	int z=30; //5. this.z = 300

	Point3D2() {
		this(100, 200, 300);	// Point3D2(int x, int y, int z)�� ȣ���Ѵ�.
	}

	Point3D2(int x, int y, int z) {
		super(x, y);			// Point3(int x, int y)�� ȣ���Ѵ�.
		this.z = z;
	}
}
// 1.point3D 클래스의 인스턴스를 생성하기 위해 조상클래스인 point 클래스와 point3d 클래스가 메모리에 로드된다
// 2. 참조변수 p3와 Point3D 인스턴스가 생성된다 call stack-> p3 , heap -> x,y,z
// 3. 인스턴스 변수에 대한 명시적 초기화 수행 
//     x= 10, y=20, z=30
// 4. 생성자 Point3D()가 호출되고 this(100,200,300)이 Point3D(int x, int y, int z)를 호출하고  100,200,300 인 상태로 stack에 올라감
// 5. super(x,y)가 호출 되었을때 넘겨 받은 값(100,200)을 들고 Point(int x, int y)로 가서 값을 변경한다. 


// this()는 같은 클래스의 다른 생성자를 호출하는데 사용되지만 , super()는 조상 클래스의 생성자를 호출하는데 사용된다.
// Object 클래스를 제외한 모든 클래스의 생성자 첫 줄에 생성자 this()또는 super() 를 호출해야한다 그렇지 않으면 컴파일러가 자동적으로 super();를 생성자 첫줄에 삽임

// 생성자의 첫줄에서 조상클래스의 생성자를 호출해야하는 이유 : 자손 클래스의 멤버가 조상클래스의 멤버를 사용할 수도 있어서 조상의 멤버들이 먼저 초기화 되어 있어야함
