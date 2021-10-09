package array;

import java.security.acl.LastOwnerException;

public class Ex_05_05 {

	public static void main(String[] args) {

		int[] ballArr = {1,2,3,4,5,6,7,8,9};
		int[] ball3 = new int[3];
		
		// ballArr . 배열 의 임의의 요소를 골라서 위치를 바꾼다
        for(int i=0; i< ballArr.length;i++) {
			int j = (int)(Math.random() * ballArr.length);
			int tmp = 0;
			
			tmp = ballArr[i];     // 빈 변수 tmp을 선언해서  변수 3개를 계속 섞어준다
			ballArr[i] = j;
			j =  tmp;
		}

//	  배열 ballArr의 앞에서 3개의 수를 배열 ball3 로 복사한다
		/* (2) */
        System.arraycopy(ballArr, 0, ball3, 0, 3); 
        
		
		
		
		for(int i=0;i<ball3.length;i++) {
			System.out.print(ball3[i]);
		}
	}
}


// system.arraycopy를  말고 다른 방법으로도 해보았다

		int[] ballArr = {1,2,3,4,5,6,7,8,9};
		int[] ball3 = new int[3*3];  //             ballArr와 배열의 길이를 맞췄다

		// ballArr . 배열 의 임의의 요소를 골라서 위치를 바꾼다
		for(int i=0; i< ballArr.length;i++) {
			int j = (int)(Math.random() * ballArr.length);
			int tmp = 0;

			tmp = ballArr[i];     // 빈 변수 tmp을 선언해서  변수 3개를 계속 섞어준다
			ballArr[i] = j;
			j =  tmp;
		}
		for (int i =0; i <ballArr.length; i++) {   // 반복문을 한번 더 사용해서 ball3에게 값 전달
			ball3[i] = ballArr[i];
			
		}
		for(int i=0;i<3;i++) {   //  ball3의 배열 길이를 늘려주기전으로 적어서 3자리를 출력하게 한다
			System.out.print(ball3[i]);
		}
	}
}

