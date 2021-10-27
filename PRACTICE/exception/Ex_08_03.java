package exception;

public class Ex_08_03 {

	public static void main(String[] args) {

//		[8-3] 다음 중 오버라이딩이 잘못된 것은? (모두 고르시오)
//				
//				void add(int a, int b)
//				throws InvalidNumberException, NotANumberException {}
//				class NumberException extends Exception {}
//				class InvalidNumberException extends NumberException {}
//				class NotANumberException extends NumberException {}
//				
//				a. void add(int a, int b) throws InvalidNumberException, NotANumberException {}
//				b. void add(int a, int b) throws InvalidNumberException {}
//				c. void add(int a, int b) throws NotANumberException {}
//				d. void add(int a, int b) throws Exception {}
//				e. void add(int a, int b) throws NumberException {}
		
		//조상 클래스의 메서드보다 많은 수의 예외를 선언할 수 없다.
		// 적거나 같아야한다.

		//d.e
		
		
		
		// a는 2개 예외처리
		//e는 조상과 2개의 자손, 모두 3개의 예외를 처리할 수 있다.
		
	}

}
