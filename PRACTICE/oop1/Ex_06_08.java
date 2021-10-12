package oop1;

public class Ex_06_08 {

	public static void main(String[] args) {

		
		//6-8다음의 코드에 정의된 변수들을 종류별로 구분해서 적으시오.
			class PlayingCard {
				
			int kind;
			int num;
			
			static int width;
			static int height;
		
			PlayingCard(int k, int n) {
				kind = k;
				num = n;
			}
			
			
			public static void main(String args[]) {
					PlayingCard card = new PlayingCard(1,1);
				}
			}
			- 클래스변수(static ) :  width,height
			-  인스턴스변수 	  :  kind ,num
			-  지역변수           :	 k,n,arg 
			
			// 지역변수에 card 안적어서 틀렸음
			
			}
		
		}
