package oop2;
//
//
//	[7-2] 문제7-1의 SutdaDeck1클래스에 다음에 정의된 새로운 메서드를 추가하고 테스트 하
//	시오.
//	[주의] Math.random()을 사용하는 경우 실행결과와 다를 수 있음.
//	--1	. 메서드명 : shuffle
//	기 능 : 배열 cards에 담긴 카드의 위치를 뒤섞는다.(Math.random()사용)
//	반환타입 : 없음
//	매개변수 : 없음

//	2. 메서드명 : pick
//	기 능 : 배열 cards에서 지정된 위치의 SutdaCard1를 반환한다.
//	반환타입 : SutdaCard1
//	매개변수 : int index - 위치

//	3. 메서드명 : pick
//	기 능 : 배열 cards에서 임의의 위치의 SutdaCard1를 반환한다.(Math.random()사용)
//	반환타입 : SutdaCard1
//	매개변수 : 없음

class SutdaDeck1 {
		final int CARD_NUM = 20;
		SutdaCard1[] cards = new SutdaCard1[CARD_NUM];
		SutdaDeck1() {

			for(int i=0;i < cards.length;i++) {
				int num = i%10+1;
				boolean isKwang = (i < 10)&&(num==1||num==3||num==8);
				cards[i] = new SutdaCard1(num,isKwang);
			}
		}
				
		public void shuffle() {
			for(int i =0; i <cards.length;  i++) {
				int card = (int)(Math.random()*cards.length);;
				SutdaCard1 tmp = cards[i];    //배열의 요소가 SutdaCard1타입이니까 
				cards[i] = cards[card];
				cards[card] =  tmp;
				
			}
		}
		
		public SutdaCard1 pick (int index) {  
			if(index < 0 || index >= cards.length) {
				return null;  
			}
			return cards[index];  // 인자에 적어진 숫자를 인덱스로 받아서 그위치에 있는 요소를 반환
			//매개변수가 있는 ,, 숫자로 받는것은 유효성검사를 실시해야한다는것을 잊지말자.
			
		}
		public SutdaCard1 pick () {
			int j = (int)(Math.random()*cards.length);
			
			return cards[j];
		}
		
		
		
		
			
} // SutdaDeck1


class SutdaCard1 {
	
	int num;
	boolean isKwang;
	SutdaCard1() {
		this(1, true);
	}
	SutdaCard1(int num, boolean isKwang) {
		this.num = num;
		this.isKwang = isKwang;
	}
	public String toString() {
		return num + ( isKwang ? "K":"");
	}
}

public class Ex_07_02 {

	public static void main(String[] args) {


		SutdaDeck1 deck = new SutdaDeck1();
		System.out.println(deck.pick(0));
		System.out.println(deck.pick());
		deck.shuffle();
		for(int i=0; i < deck.cards.length;i++)
			System.out.print(deck.cards[i]+",");
		System.out.println();
		System.out.println(deck.pick(0));
	}

}

//1K
//7
//2,6,10,1K,7,3,10,5,7,8,5,1,2,9,6,9,4,8K,4,3K,
//2
