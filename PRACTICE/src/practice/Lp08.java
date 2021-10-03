package practice;

import java.security.acl.LastOwnerException;

public class Lp08 {

	public static void main(String[] args) {
//
//		숫자로 이루어진 문자열 이 있을 때 각 자리의 합을 더한 결과를 출력하는 코 str ,
//		드를 완성하라 만일 문자열이 "12345"라면 ‘1+2+3+4+5’의 , 출력이 15인 결과를  출력되 
//		어야 한다 
		
//		String str = "12345";
//		int sum = 0;
//		for(int i=0; i < str.length(); i++) {
//		
//			sum+= str.charAt(i)- '0';
//		}
//		System.out.println("sum="+sum);
//		System.out.println( str.length());
		
		
		int num = 12345;
		int sum = 0;
		
		while (num > 0) {
			sum+= num %10;
			num /= 10;
			
			
		}
		
		
		System.out.println(sum);

		
	}
}
