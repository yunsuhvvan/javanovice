package oop;
import java.util.ArrayList;

class Fruit3		        { public String toString() { return "Fruit";}}
class Apple3 extends Fruit3 { 
	public String toString() {
		return "Apple";
		}
	}
class Grape3 extends Fruit3 { public String toString() { return "Grape";}}

class Juice {
	String name;

	Juice(String name)	     { 
		this.name = name + "Juice";
		}
	public String toString() { return name;		 }
}

class Juicer {
	static Juice makeJuice(FruitBox3<? extends Fruit3> box) {
		String tmp = "";
		
		for(Fruit3 f : box.getList()) 
			tmp += f + " ";
		return new Juice(tmp);   // Juice 클래스가스 과일이름에  "Juice" 추가되며 초기화 된다.
	}
}

class FruitBoxEx3 {
	public static void main(String[] args) {
		FruitBox3<Fruit3> fruitBox = new FruitBox3<Fruit3>();  // Fruit와 그 자손 타입이 될 수 있다.
		FruitBox3<Apple3> appleBox = new FruitBox3<Apple3>();  

		fruitBox.add(new Apple3());   // add의 매개변수도 Fruit와 그 자손 타입이 될 수 있다.
		fruitBox.add(new Grape3());
		appleBox.add(new Apple3());   
		appleBox.add(new Apple3());

		System.out.println(Juicer.makeJuice(fruitBox)); // Fruit를 포함한 자손들까지가능
		System.out.println(Juicer.makeJuice(appleBox)); // Apple만 가능
	}  // main
}

class FruitBox3<T extends Fruit3> extends Box3<T> {} 

class Box3<T> {
//class FruitBox<T extends Fruit> {
	ArrayList<T> list = new ArrayList<T>();
	void add(T item) { list.add(item);      }
	T get(int i)     { return list.get(i); }
	ArrayList<T> getList() { return list;  }
	int size()       { return list.size(); }
	public String toString() { return list.toString();}
}


// static을 논하는건 클래스 레벨에서이고 메서드레벨에서는 사용가능하다고한다.
