package practice;

public class Looppractice02 {

	public static void main(String[] args) {
//		[4-3] 1+(1+2)+(1+2+3)+(1+2+3+4)+...+(1+2+3+...+10) 의 결과를 계산하시오
		int sum =0;
		int total =0;
		
		for (int i =1 ; i <=10; i++) {
			
			sum+=i;
			total += sum;
		}
		System.out.println(total);
	}

}
