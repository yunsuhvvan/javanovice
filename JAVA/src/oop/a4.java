package oop;
class Product {
	 static int count = 0;   // 1번쨰
	int serialNo;	        // 2번째   "0"으로 초기화 

	{						//3번쨰
		++count;          //  count를 1씩 증가 
		serialNo = count; 
	}

	public Product() {}     // 기본 생성자, 생략가능
}

class ProductTest {
	public static void main(String args[]) {
		Product p1 = new Product();
		Product p2 = new Product();
		Product p3 = new Product();

		System.out.println("p1의 제품 번호(serial no)는 " + p1.serialNo);
		System.out.println("p2의 제품 번호(serial no)는 " + p2.serialNo);
		System.out.println("p3의 제품 번호(serial no)는 " + p3.serialNo);
		System.out.println("생산된 제품수는 모두"+Product.count+"개 입니다.");  
	}
}


/*
 * 
 * 	 클래스 초기화                           
 * 1.기본값 2. 명시적초기화 3. 클래스초기화블럭
 * 
 * 인스턴스초기화
 * 4.기본값  5. 명시적 초기화 6. 인스턴스 초기화 블럭 7.생성자
 * 
 * count를 인스턴스로 변수로 선언했다면, 인스턴스가 생성될 때마다 0으로 초기화 될 것이므로
 * 모든 Product 인스턴스 serialNo는 1일것이다
 * 
 * 클래스 변수는 클래스가 처음 로딩될 때 단 한번 초기화가 된다 
 * 인스턴스변수는 인스턴스가 생성될 때마다 각 인스턴스별로 초기화가 이루어진다.
 * 
 * 
 *
 * */
 
