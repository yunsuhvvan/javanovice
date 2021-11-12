package collection;
	//
	//[11-11] 다음은 SutdaCard클래스를 HashSet에 저장하고 출력하는 예제이다. HashSet에
	//중복된 카드가 저장되지 않도록 SutdaCard의 hashCode()를 알맞게 오버라이딩하시오.
	//[Hint] String클래스의 hashCode()를 사용하라.
import java.util.*;
class SutdaCard {
	int num;
	boolean isKwang;
	SutdaCard() {
		this(1, true);
	}
	SutdaCard(int num, boolean isKwang) {
		this.num = num;
		this.isKwang = isKwang;
	}
	public boolean equals(Object obj) {
		if(obj instanceof SutdaCard) {
			SutdaCard c = (SutdaCard)obj;
			return num==c.num && isKwang==c.isKwang;
		} else {
			return false;
		}
	}
	public String toString() {
		return num + ( isKwang ? "K":"");
	}
	public int hashCode() {
		return toString().hashCode();  
	}
	
	
}
class Exercise11_11 {
	public static void main(String[] args) {
		SutdaCard c1 = new SutdaCard(3,true);
		SutdaCard c2 = new SutdaCard(3,true);
		SutdaCard c3 = new SutdaCard(1,true);
		HashSet set = new HashSet();
		set.add(c1);
		set.add(c2);
		set.add(c3);
		System.out.println(set);
	}
}
//
//때로는 equals()만 오버라이딩해줘도 되지만, 해시알고리즘을 사용하는 HashSet에 담을
//때는 반드시 hashCode()도 오버라이딩해줘야 한다.

//SutdaCar의 경우 num과 isKwang의 값이 같으면 같은 객체로 인식해야한다. 즉, equals()
//의 결과가 true이어야하고, 두 객체의 해시코드(hashCode()를 호출한 결과)가 같아야 한
//다. 그래서 equals()와 hashCode()를 적절히 오버라이딩 해줘야 한다.

