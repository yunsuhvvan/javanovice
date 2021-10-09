package array;

import java.util.Arrays;

public class Ex_05_11 {

	public static void main(String[] args) {
//		주어진 2차원 배열의 데이터보다 가로와 세로로 1이 더 큰 배열을 생성해서 배열 
//		의 행과 열의 마지막 요소에 각 열과 행의 총합을 저장하고 출력하는 프로그램이다. (1)
//		에 알맞은 코드를 넣어서 완성하시오.

		int[][] score = {
							  {100, 100, 100}
							, {20, 20, 20}
							, {30, 30, 30}
							, {40, 40, 40}
							, {50, 50, 50}
		};	
		int[][] result = new int[score.length+1][score[0].length+1];
		
		// result[6][4]  
		// result[5+1][3+1]
		

		for(int i=0; i < score.length;i++) {
			for(int j=0; j < score[i].length;j++) {
				
				result[i][j] = score[i][j];
				result[i][3] += result[i][j];  // 100 + 100 + 100...50+50+50..
				result[result.length-1][j] +=result[i][j];    // 100+20+30+40+50...
				result[result.length-1][result[0].length-1] += result[i][j];
			
				//result[6-1] --> result[5] --> 0,1,2,3,4,5 
				

			} 
		}

		for(int i=0; i < result.length;i++) {
			for(int j=0; j < result[i].length;j++) {
				//System.out.printf(Arrays.deepToString(result));
				System.out.printf("%10d" , result[i][j]);   
			}
			System.out.println();
		}

	}

}
