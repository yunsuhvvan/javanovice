package oop;
import java.util.ArrayList;

class Fruit				  { public String toString() { return "Fruit";}}
class Apple extends Fruit { public String toString() { return "Apple";}}
class Grape extends Fruit { public String toString() { return "Grape";}}
class Toy		          { public String toString() { return "Toy"  ;}}
// 지네릭 클래스의 객체 생성과 사용
class FruitBoxEx1 {
	public static void main(String[] args) {
		Box<Fruit> fruitBox = new Box<Fruit>();
		Box<Apple> appleBox = new Box<Apple>();
		Box<Toy>   toyBox   = new Box<Toy>();
//		Box<Grape> grapeBox = new Box<Apple>(); // 에러. 타입 불일치

		fruitBox.add(new Fruit());
		fruitBox.add(new Apple()); // OK. void add(Fruit item)
									// 타입 T가 Fruit인 경우 Fruit 자손들은 이 메서드의 매개변수가 될 수 있다.


		appleBox.add(new Apple());
		appleBox.add(new Apple());
//		appleBox.add(new Toy()); // 에러 Box<Apple>에는 Apple만 담을 수 있음
		toyBox.add(new Toy());
//		toyBox.add(new Apple()); //에러 Box<TOy>에는 Apple만 담을 수 없음

		System.out.println(fruitBox);
		System.out.println(appleBox);
		System.out.println(toyBox);
	}  // main�� ��
}

class Box<T> {
	ArrayList<T> list = new ArrayList<T>();   // T는 인스턴스 변수로 간주된다.
											  // Box<T>의 객체에는 한가지 종류, T타입 객체만 저장할 수 있는데,
											  // ArrayList를 이용해서 여러객체 저장 가능하게 함.
	void add(T item)  { list.add(item); }
	T get(int i)      { 
		return list.get(i); 
		}
	int size() { 
		return list.size(); 
		}
	public String toString() {
		return list.toString();
		}
}


//class FruitBox2<T extends Fruit2 & Eatable> extends Box2<T> {} // 한 종류의 타입만 담을 수 있지만 Fruit 클래스 자손만 담을 수 있다
// Eatable 구현한 클래스도 담을 수 있다.
