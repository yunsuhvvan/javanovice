package collection;

import java.util.Comparator;
import java.util.HashMap;
import java.util.TreeMap;

//[11-13] 다음 코드는 문제11-12를 발전시킨 것으로 각 Player1들의 점수를 계산하고, 점
//수가 제일 높은 사람을 출력하는 코드이다. TreeMap의 정렬기준을 점수가 제일 높은 사람
//부터 내림차순이 되도록 아래의 코드를 완성하시오. 단, 동점자 처리는 하지 않는다.
class Exercise11_13 {
	public static void main(String args[]) throws Exception
	{
		SutdaDeck1 deck = new SutdaDeck1();
		deck.shuffle();
		Player1[] pArr = {
				new Player1("타짜 ", deck.pick(), deck.pick()), 
				new Player1("고수 ", deck.pick(), deck.pick()), 
				new Player1("물주 ", deck.pick(), deck.pick()), 
				new Player1("중수 ", deck.pick(), deck.pick()), 
				new Player1("하수 ", deck.pick(), deck.pick()) 
		};
		TreeMap rank = new TreeMap(new Comparator(){
			public int compare(Object o1, Object o2) {
				/*
(1) . 알맞은 코드를 넣어 완성하시오
				 */
				if( o1 instanceof Player1 && o2 instanceof Player1) {
					Player1 p1 = (Player1)o1;
					Player1 p2 = (Player1)o2;
					
					return p1.point - p2.point  *1;
				}
				return-1;
				
			}
		});
		for(int i=0; i < pArr.length;i++) {
			Player1 p = pArr[i];
			rank.put(p, deck.getPoint(p));
			System.out.println(p+" "+deck.getPoint(p));
		}
		System.out.println();
		System.out.println("1위는 "+rank.firstKey()+" 입니다 ."); 
	}
}
class SutdaDeck1
{
	final int CARD_NUM = 20;
	SutdaCard12[] cards = new SutdaCard12[CARD_NUM];
	int pos = 0; // 다음에 가져올 카드의 위치
	HashMap jokbo = new HashMap(); // HashMap 족보를 저장할
	SutdaDeck1() {
		for(int i=0;i < cards.length;i++) {
			int num = i%10+1;
			boolean isKwang = i < 10 && (num==1 || num==3 || num==8);
			cards[i] = new SutdaCard12(num,isKwang);
		}
		registerJokbo(); // . 족보를 등록한다
	}
	void registerJokbo() {
		jokbo.put("KK", 4000);
		jokbo.put("1010",3100); jokbo.put("12", 2060);
		jokbo.put("99", 3090); jokbo.put("21", 2060);
		jokbo.put("88", 3080); jokbo.put("14", 2050);
		jokbo.put("77", 3070); jokbo.put("41", 2050);
		jokbo.put("66", 3060); jokbo.put("19", 2040);
		jokbo.put("55", 3050); jokbo.put("91", 2040);
		jokbo.put("44", 3040); jokbo.put("110", 2030);
		jokbo.put("33", 3030); jokbo.put("101", 2030);
		jokbo.put("22", 3020); jokbo.put("104", 2020);
		jokbo.put("11", 3010); jokbo.put("410", 2020);
		jokbo.put("46", 2010);
		jokbo.put("64", 2010);
	}
	int getPoint(Player1 p) {
		if(p==null) return 0;
		SutdaCard12 c1 = p.c1;
		SutdaCard12 c2 = p.c2;
		Integer result = 0;
		if(c1.isKwang && c2.isKwang) {
			result = (Integer)jokbo.get("KK");
		} else {
			result = (Integer)jokbo.get(""+c1.num+c2.num);
			if(result==null) {
				result = new Integer((c1.num + c2.num) % 10 + 1000);
			}
		}
		p.point = result.intValue();
		return result.intValue();
	}
	SutdaCard12 pick() throws Exception {
		SutdaCard12 c = null;
		if(0 <= pos && pos < CARD_NUM) {
			c = cards[pos];
			cards[pos++] = null;
		} else {
			throw new Exception("남아있는 카드가 없습니다 ."); 
		}
		return c;
	}
	void shuffle() {
		for(int x=0; x < CARD_NUM * 2; x++) {
			int i = (int)(Math.random() * CARD_NUM);
			int j = (int)(Math.random() * CARD_NUM);
			SutdaCard12 tmp = cards[i];
			cards[i] = cards[j];
			cards[j] = tmp;
		}
	}
} // SutdaDeck1
class Player1 {
	String name;
	SutdaCard12 c1;
	SutdaCard12 c2;
	int point;
	Player1(String name, SutdaCard12 c1, SutdaCard12 c2) {
		this.name = name ;
		this.c1 = c1 ;
		this.c2 = c2 ;
	}
	public String toString() {
		return "["+name+"]"+ c1.toString() +","+ c2.toString();
	}
} // class Player1
class SutdaCard12 {
	int num;
	boolean isKwang;
	SutdaCard12() {
		this(1, true);
	}
	SutdaCard12(int num, boolean isKwang) {
		this.num = num;
		this.isKwang = isKwang;
	}
	public String toString() {
		return num + ( isKwang ? "K":"");
	}
}
