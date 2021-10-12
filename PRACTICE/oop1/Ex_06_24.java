package oop1;

public class Ex_06_24 {
	
//	메서드명 : abs
//	기 능  : 주어진 값의 절대값을 반환한다 .
//	반환타입 : int
//	매개변수 : int value
	
	static int abs(int value) {
		if(value >=0) {
			return value;
		} else {
			return -value;
		}
	}
	
	

	public static void main(String[] args) {

		int value = 5;
		System.out.println(value+" 의 절대값:"+abs(value)); 
		value = -10;
		System.out.println(value+" 의 절대값 :"+abs(value));
		
	}

}
