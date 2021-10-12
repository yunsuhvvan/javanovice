package oop1;

public class EX_06_18 {


	int iv = 10;
	static int cv = 20;           
	int iv2 = cv;
	static int cv2 = iv; 	// A 라인 static 변수 초기화에 iv를 사용할 수 없음
	
	static void staticMethod1() {
		System.out.println(cv);
		System.out.println(iv); // B 라인           
	}  //호출하기 위해서 객체 생성이 필요한 iv는 그렇지 않은 static 메소드 내부에서는 사용할 수 없다
	
	void instanceMethod1() {
		System.out.println(cv);    
		System.out.println(iv); 
	}
	
	static void staticMethod2() {
		staticMethod1();
		instanceMethod1(); // D 라인   B라인이랑 똑같은 개념이다.
	}
	
	void instanceMethod2() {
		staticMethod1(); 
		instanceMethod1();
	}

}


