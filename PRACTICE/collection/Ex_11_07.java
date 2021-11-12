package collection;

//		[11-7] 다음에 제시된 BanNoAscending클래스를 완성하여, ArrayList에 담긴 Student2인
//		스턴스들이 반(ban)과 번호(no)로 오름차순 정렬되게 하시오.(반이 같은 경우 번호를 비
//		교해서 정렬한다.)

import java.util.*;
class Student2 {
	String name;
	int ban;
	int no;
	int kor;
	int eng;
	int math;
	Student2(String name, int ban, int no, int kor, int eng, int math) {
		this.name = name;
		this.ban = ban;
		this.no = no;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
	int getTotal() {
		return kor+eng+math;
	}
	float getAverage() {
		return (int)((getTotal()/ 3f)*10+0.5)/10f;
	}
	public String toString() {
		return name
				+","+ban
				+","+no
				+","+kor
				+","+eng
				+","+math
				+","+getTotal()
				+","+getAverage()
				;
	}
} // class Student2 
class BanNoAscending implements Comparator {
	public int compare(Object o1, Object o2) {
		if(o1 instanceof Student2 && o2 instanceof Student2) { 
			Student2 s1 = (Student2)o1;
			Student2 s2 = (Student2)o2;
			
		   int result = s1.ban - s2.ban ;  //양수이면 자리 변경
			
			if(result == 0) {  // ban이 같으면
				return s1.no - s2.no; //번호를 자리변경한다
			}
			return result;
		}
		return -1;
	 
	}
}
public class Ex_11_07 {

	public static void main(String[] args) {

		ArrayList list = new ArrayList();
		list.add(new Student2("이자바 ",2,1,70,90,70));
		list.add(new Student2("안자바 ",2,2,60,100,80)); 
		list.add(new Student2("홍길동 ",1,3,100,100,100)); 
		list.add(new Student2("남궁성 ",1,1,90,70,80)); 
		list.add(new Student2("김자바 ",1,2,80,80,90)); 
		Collections.sort(list, new BanNoAscending());
		Iterator it = list.iterator();
		while(it.hasNext())
			System.out.println(it.next());
	}

}

//compareTo() 메서드 작성법
//현재 객체 < 파라미터로 넘어온 객체: 음수 리턴
//현재 객체 == 파라미터로 넘어온 객체: 0 리턴
//현재 객체 > 파라미터로 넘어온 객체: 양수 리턴
//음수 또는 0이면 객체의 자리가 그대로 유지되며, 양수인 경우에는 두 객체의 자리가 바뀐다.

//compare() 메서드 작성법
//첫 번째 파라미터로 넘어온 객체 < 두 번째 파라미터로 넘어온 객체: 음수 리턴
//첫 번째 파라미터로 넘어온 객체 == 두 번째 파라미터로 넘어온 객체: 0 리턴
//첫 번째 파라미터로 넘어온 객체 > 두 번째 파라미터로 넘어온 객체: 양수 리턴
//음수 또는 0이면 객체의 자리가 그대로 유지되며, 양수인 경우에는 두 객체의 자리가 변경된다.