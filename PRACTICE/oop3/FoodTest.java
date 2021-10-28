package oop3;


public class FoodTest {
	  public static void main(String[] args) {
	    // 음식 객체 생성
	    Food chicken = new Food("치킨", 18000);
	    Food pizza = new Food("피자", 28000);
	    Food sushi = new Food("초밥세트", 22000);
	    
	    // 객체 배열에 음식 담기
	    Food[] foods = { chicken, pizza, sushi };
	    
	    // 모든 음식 정보 출력
	    for (int i = 0; i < foods.length; i++) {
	      System.out.println(foods[i]);   // 객체만 사용해도 toString 호출할 수 있기때문에 굳이 toString안써도 된다.
	    }
	  }
	}

class Food {
	/* 1. 필드를 추가하세요. */

	String name;
	int price;

	/* 2. 생성자를 추가하세요. */

	public Food(){
	}
	
	public Food(String name, int price){
		this.name = name;
		this.price = price;
	}

	/* 3. toString() 메소드를 추가하세요. */
	// 오버라이딩하기
	public String toString(){   //최상위 object클래스가 가진 메소드 중 하나

		return "name : " +this.name + "," + "price : " + this.price + "원";
	}
}  
//실행결과
//name : 치킨,price : 18000원
//name : 피자,price : 28000원
//name : 초밥세트,price : 22000원


