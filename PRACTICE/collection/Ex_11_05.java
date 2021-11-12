package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

//
//[11-5] 다음에 제시된 Student클래스가 Comparable인터페이스를 구현하도록 변경해서
//이름(name)이 기본 정렬기준이 되도록 하시오.
class Student implements Comparable {
	String name;
	int ban;
	int no;
	int kor, eng, math;
	Student(String name, int ban, int no, int kor, int eng, int math) {
		this.name = name;
		this.ban = ban;
		this.no = no;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}int getTotal() {
		return kor+eng+math;
	}float getAverage() {
		return (int)((getTotal()/ 3f)*10+0.5)/10f;
	}
	public String toString() {
		return name +","+ban +","+no +","+kor +","+eng +","+math
				+","+getTotal() +","+getAverage();
	}
	@Override
	public int compareTo(Object o) { // comparator ->compare    comparable -> compareTo
		if(o instanceof Student) {
			Student tmp = (Student)o;
			return this.name.compareTo(tmp.name); // 본인이 가지고있는 멤버변수와 tmp 멤버변수를 비교하여 정렬한다. 
		}		
		return -1;
	}
	
	// 기본 정렬 기준 
	// 같으면 0 작으면 - 크면 +
	// comparable - 자기 자신 객체와  Object을 다운캐스팅한거랑 비교함
	// String클래스는 이미 compareTo 메서드를 구현해놨다
	//ArrayList에 저장된 요소들은 모두 comparble 인터페이스를 구현해야한다.
	 
}
class Exercise11_5 {
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add(new Student("홍길동",1,1,100,100,100));
		list.add(new Student("남궁성",1,2,90,70,80));
		list.add(new Student("김자바",1,3,80,80,90));
		list.add(new Student("이자바",1,4,70,90,70));
		list.add(new Student("안자바",1,5,60,100,80));
		Collections.sort(list);
		Iterator it = list.iterator();
		while(it.hasNext())
			System.out.println(it.next());
	}
}
