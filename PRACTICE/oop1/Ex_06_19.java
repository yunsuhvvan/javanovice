package oop1;

public class Ex_06_19 {
	
	public static void change(String str) {
		str += "456";
	}

	
	
	
	public static void main(String[] args) {

		String str = "ABC123";
		System.out.println(str);
		change(str);
		System.out.println("After change:"+str);
			
	}

}


// 실행 전 예측
// 참조형 매개변수는 읽기,변경이 가능하다
// main String str의 주소값을 class String str에게 전달

// ABC123
// After change :  ABC123  


//답안: ABC123
//		After change:ABC123

