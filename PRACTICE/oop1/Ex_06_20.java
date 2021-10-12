package oop1;

//메서드명 : shuffle
//기 능 : 주어진 배열에 담긴 값의 위치를 바꾸는 작업을 반복하여 뒤섞이게 한다 
//처리한 배열을 반환한다.
//반환타입 : int[]
//매개변수 :  int[] arr -정수값이 담긴 배열 

public class Ex_06_20 {
	
	
	
	
	
	public static int[] shuffle(int[] arr) {   //메인 메소드에서 전달 받은값
		 
		
		 for(int i =0; i < arr.length; i++) {
			 int j =  (int)(Math.random()*arr.length);
			 
			 int tmp;
			 tmp =  arr[i];
			 arr[i] =  arr[j];
			 arr[j] = tmp;
		 }
		 return arr;  
		 //배열이나 객체나 모두 참조변수(객체의 주소, 리모콘)로 다루는거여서 반환타입이
		 // 배열이여도 변수 이름만 적으면 된다. 실제로는 int[]을 참조하고 있기 때문에
		  
		 
		 
//       이 문제에서 public static을 사용한 이유
		 
//		 인스턴스 맴버에 접근하지 않는다면 인스턴스에 종속시켜버릴 필요가 없다
//		 저 메소드는 파라미터로 전달되는 인자를 가공해서 반환만 하는 역할이니
//		 인스턴스마다 존재할필요가 없다
//			
//		  static으로 선언해놓고 별다른 인스턴스 생성없이 호출이 가능하고 모든 곳에서 공유
//			
//		 이것말고도 메인 메소드가 static이기 때문에 저 메소드도 static이여야 한다...
	}

	

	
	
	public static void main(String[] args) {
		
		int[] original = {1,2,3,4,5,6,7,8,9};
		
		System.out.println(java.util.Arrays.toString(original));
		
		int[] result = shuffle(original);   // 인자..  메소드에서 호출시 전달되는 값
		
		System.out.println(java.util.Arrays.toString(result));

	}

}


