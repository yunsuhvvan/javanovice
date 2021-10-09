package array;

public class Ex_05_09 {

	public static void main(String[] args) {

		char[][] star = {
							{'*','*',' ',' ',' '},
							{'*','*',' ',' ',' '},
							{'*','*','*','*','*'},
							{'*','*','*','*','*'}
		};
		char[][] result = new char[star[0].length][star.length];  
		// 90도로 회전을 시켜서 결과를 담을 배열 생성
		
		for(int i=0; i < star.length;i++) {
			for(int j=0; j < star[i].length;j++) {
			 
				int a = j;
				int b = star.length-1-i;     //b는  i가 증가하면서 3,2,1,0 순으로
				result[a][b] = star[i][j];     // result[0][3] =  star[0][0]    ..  
			}
		}
		
		for(int i=0; i < result.length;i++) {
			for(int j=0; j < result[i].length;j++) {
				System.out.print(result[i][j]);
			}
			System.out.println();
		}

	}

}
