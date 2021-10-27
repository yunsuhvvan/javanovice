package exception;

public class Ex_08_07 {

	
	static void method(boolean b) {
		try {
			System.out.println(1);
			if(b) System.exit(0);  // 메인메서드처럼 프로그램을 종료시킨다는 비슷한 의미..?
			
			System.out.println(2);
			
		} catch(RuntimeException r) {
			System.out.println(3);
			return;
		} catch(Exception e) {
			System.out.println(4);
			return;
		} finally {
			System.out.println(5);
		}
		System.out.println(6);
	}
	public static void main(String[] args) {

//		method(true);  //1 
		method(false);  // 1,2,5,6

	}

}
