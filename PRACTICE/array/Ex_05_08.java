package array;

public class Ex_05_08 {

	public static void main(String[] args) {


		int[] answer = { 1,4,4,3,1,4,4,2,1,3,2 };
		int[] counter = new int[4];
		

		for(int i=0; i < answer.length;i++) {
			
			;
			//counter[i] = answer[i];    // answer 배열 값을 counter에게 전달(?)
			counter[answer[i]-1]++;   //    
		}
		for(int i=0; i < counter.length;i++) {
			System.out.print(counter[i]);
			for (int j =0; j < counter[i]; j++) {
				System.out.printf("*");
			}
			
			
			System.out.println();
			}
		}
	}

//   counter[answer[i]-1]++ 에서 뭘 넣어야 할 지 몰라서 시간이 많이 소요 됨
//  배열 answer의 길이는 11, counter[i]은 0 1 2 3  , answer[i]의 범위는 1~4라서 -1 했음
// 안하면 arrayindexoutofbound..될 것이라 생각..






