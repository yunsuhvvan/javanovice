package oop2;

//[7-1] 섯다카드 20장을 포함하는 섯다카드 한 벌(SutdaDeck클래스)을 정의한 것이다. 섯
//다카드 20장을 담는 SutdaCard배열을 초기화하시오. 단, 섯다카드는 1부터 10까지의 숫자
//가 적힌 카드가 한 쌍씩 있고, 숫자가 1, 3, 8인 경우에는 둘 중의 한 장은 광(Kwang)이
//어야 한다. 즉, SutdaCard의 인스턴스변수 isKwang의 값이 true이어야 한다.
//





	class SutdaDeck {
		final int CARD_NUM = 20;
		SutdaCard[] cards = new SutdaCard[CARD_NUM];     // 20개의 저장공간만 만듬
		
		SutdaDeck() {                       
			//코드
			
			for(int i=0;i < cards.length;i++) {
				int num = i%10+1;
				boolean isKwang = (i < 10)&&(num==1||num==3||num==8);
				cards[i] = new SutdaCard(num,isKwang);
				}


		
			
			
			
			
// 			오답			
//			for (int j = 0; j <CARD_NUM; j++) {
//				if(j==1 || j==3|| j==8) {
//					cards[j].isKwang = true;
//				}
//				if(j>10) {
//					cards[j].num = j-10;
//				}
//				cards[j] = new SutdaCard(num ,isKwang);
//			}
			
			
//			오답
//			for (int i =0; i < cards.length; i++) {
//				int num = i%10+1;
//				boolean isKwang = false;
//				if (i<10) {
//					isKwang = (i ==1);
//					isKwang = (i ==3);
//					isKwang = (i ==8);
//				}
//				cards[i] = new SutdaCard(num,isKwang);
//			}
		}
	}

	class SutdaCard {
		int num;
		boolean isKwang;
		SutdaCard() {                
			this(1, true); // SutdaCard 클래스의 인스턴스를 생성할때 생성자에게 아무런 인자값을 전달하지 
			//않는 형태로 생성할 경우를 위해서 정의한 생성자
		}
		SutdaCard(int num, boolean isKwang) {
			this.num = num;
			this.isKwang = isKwang;
		}
		// info()대신 Object클래스의 toString()을 오버라이딩했다.
		public String toString() {
			return num + ( isKwang ? "K":"");
		}
	}


public class Ex_07_01 {
	public static void main(String[] args) {
		

		SutdaDeck deck = new SutdaDeck();
		for(int i=0; i < deck.cards.length;i++)
			System.out.print(deck.cards[i]+",");   //println에 객체를 주면 toString이 실행된다.
		System.out.println();
	}

}

//deck 


//실행결과 ;  1K,2,3K,4,5,6,7,8K,9,10,
//            1,2,3,4,5,6,7,8,9,10,