package collection;
//	[11-9] 문제11-8의 Student44클래스에 반등수(classRank)를 저장하기 위한 인스턴스변수
//	를 추가하였다. 반등수를 계산하고 반과 반등수로 오름차순 정렬하여 결과를 출력하시오.
//	(1)~(2)에 알맞은 코드를 넣어 완성하시오.
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
class Student4 implements Comparable {
	String name;
	int ban;
	int no;
	int kor;
	int eng;
	int math;
	int total;
	int schoolRank; // 전교등수
	int classRank; // 반등수
	Student4(String name, int ban, int no, int kor, int eng, int math) {
		this.name = name;
		this.ban = ban;
		this.no = no;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		total = kor+eng+math;
	}
	int getTotal() {
		return total;
	}
	float getAverage() {
		return (int)((getTotal()/ 3f)*10+0.5)/10f;
	}
	public int compareTo(Object o) {
		if(o instanceof Student4) {
			Student4 tmp = (Student4)o;
			return tmp.total - this.total;
		} else {
			return -1;
		}
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
				+","+schoolRank
				+","+classRank // 새로추가
				;
	}
} // class Student4
class ClassTotalComparator implements Comparator {
	public int compare(Object o1, Object o2) {
		Student4 s1 = (Student4)o1;
		Student4 s2 = (Student4)o2;
		int result = s1.ban - s2.ban; 
		if(result==0) {
			result = s2.total - s1.total; 
		return result;
	}
}
class Exercise11_9 {
	public static void calculateClassRank(List list) {
		// . 먼저 반별 총점기준 내림차순으로 정렬한다
		Collections.sort(list, new ClassTotalComparator());
		int prevBan = -1;
		int prevRank = -1;
		int prevTotal = -1;
		int length = list.size();
		
		
		for(int i=0, n=0; i < length; i++, n++) {
			Student4 s = (Student4)list.get(i);
			
			if(s.ban!=prevBan) {
				prevRank = -1;
				prevTotal = -1;
				n = 0;
			}
			if(s.total==prevTotal) {
				s.classRank = prevRank;
			} else {
				s.classRank = n + 1;
			}

			prevBan = s.ban;
			prevRank = s.classRank;
			prevTotal = s.total;
		}
	} // public static void calculateClassRank(List list) {
	
	
	public static void calculateSchoolRank(List list) {
		Collections.sort(list); // 
		int prevRank = -1; // 이전 전교등수
		int prevTotal = -1; // 이전 총점
		int length = list.size();
		for(int i=0;i < length; i++) {
			Student4 s = (Student4)list.get(i);
			if(s.total==prevTotal) {
				s.schoolRank = prevRank;
			} else {
				s.schoolRank = i + 1;
			}
			prevRank = s.schoolRank;
			prevTotal = s.total;
		} // for
	}
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add(new Student4(" 이자바",2,1,70,90,70)); 
		list.add(new Student4("안자바 ",2,2,60,100,80)); 
		list.add(new Student4("홍길동 ",1,3,100,100,100)); 
		list.add(new Student4("남궁성 ",1,1,90,70,80)); 
		list.add(new Student4("김자바 ",1,2,80,80,90)); 
		calculateSchoolRank(list);
		calculateClassRank(list);
		Iterator it = list.iterator();
		while(it.hasNext())
			System.out.println(it.next());
	}

}