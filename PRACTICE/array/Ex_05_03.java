package array;

public class Ex_05_03 {

	

	public static void main(String[] args) {

		int[] arr = {10, 20, 30, 40, 50};
		int sum = 0;
		/*
(1) . 알맞은 코드를 넣어 완성하시오
		 */
		
		for (int i =0; i < arr.length; i++) {
			sum+= arr[i];
			
		}
		
		// 일반 for문 말고 향상 for문으로 실행 시키려고도 해보았으나 실패함


		System.out.println("sum="+sum);
	}

}
