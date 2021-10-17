package oop2;


//[7-5] 다음의 코드는 컴파일하면 에러가 발생한다 그 이유를 설명하고 에러를 수정하기 .
//위해서는 코드를 어떻게 바꾸어야 하는가?

class Product{
	
	int price; 		// 제품의 가격
	int bonusPoint; // 제품구매 시 제공하는 보너스점수
	
	Product(){ // 매개변수가 있는 생성자가 있으면 컴파일러가 기본 생성자를 추가 안해주기 때문에?
		
	}
	Product(int price) {
		this.price = price;
		bonusPoint =(int)(price/10.0);
	}
}
class Tv extends Product {
	
	
	 Tv() {  // 생성자는 iv 를 초기화 한다
		super();      //자손에서는 super();를 호출하여 조상 iv 조기화
	}					// 적지 않아도 컴파일러가 자동적으로 초기화 해준다.

	public String toString() {
		return "Tv";
	}
}



public class Ex_07_05 {

	public static void main(String[] args) {

		Tv t = new Tv();
		
	}

}
