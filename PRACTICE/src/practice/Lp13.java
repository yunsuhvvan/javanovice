package practice;

public class Lp13 {

	public static void main(String[] args) {

		
		int number = 12321;
		
		int tmp = number;
		
		int result =0; // number 변수 를 거꾸로 변환해서 담을 변수
		while(tmp !=0) {
			
			 result =result * 10 +tmp % 10;
		
			 tmp/=10;
		
			
		}
		if(number == result)
			
		System.out.println( number + "는 회문수 입니다 ."); 
		
		else
			
		System.out.println( number + " ."); 
	
	}

}
