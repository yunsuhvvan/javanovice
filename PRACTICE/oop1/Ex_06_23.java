package oop1;

public class Ex_06_23 {
//	
//	메서드명 : max
//	기 능 : 주어진 int  형 배열의 값 중에서 제일 큰 값을 반환한다 .
//	만일 주어진 배열이 null 이거나 크기가  0 인 경우 -999999를 반환한다.
//	반환타입 : int
//	매개변수 : int[] arr - 최대값을 구할 배열
//	

	
	public static int max(int[] data) {
		if(data==null || data.length==0) return -999999;

		
		
		//		코드
		int max = data[0];  // max에 data배열 첫번째 요소를 넣어준다
		
		for(int i =1; i <data.length; i++) {  // max가 [0]의 요소이므로 i는 [1]부터 시작
			if(max < data[i]) {
				max = data[i];
			}
		}
		return max;
	}
	
	

	public static void main(String[] args) {

		
		int[] data = {3,2,9,4,7};
		System.out.println(java.util.Arrays.toString(data));
		System.out.println("최대값:"+max(data)); 
		System.out.println("최대값 :"+max(null)); 
		System.out.println("최대값 :"+max(new int[]{})); // 0 최대값 크기가 인 배열
	}

}
