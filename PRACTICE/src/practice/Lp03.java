package practice;

public class Lp03 {

	public static void main(String[] args) {

		
		//1+(-2)+3+(-4)+... 과 같은 식으로 계속 더해나갔을때, 몇까지 더해야 총합이 100이상 되는지 구하시오
		
		int sum = 0;  //양수
		int num =0; //음수
		
		while(sum <  100) {
			++num;
			if(num%2==0 ) sum-=num;
			else sum+=num;
			
				
			
			
		}
		System.out.println(num+"일때 총합이"+    sum);
	}

}
