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
		
		for(int i=0; i < star.length;i++) {  //length =4
			for(int j=0; j < star[i].length;j++) { //length = 5
				System.out.print(star[i][j]);
			}
			System.out.println();
		}
		System.out.println();
		
		for(int i=0; i < star.length;i++) {
			for(int j=0; j < star[i].length;j++) {
			 
				int a = j;
				int b = star.length-1-i;
				result[a][b] = star[i][j];
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
