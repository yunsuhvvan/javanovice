package exception;

public class Ex_08_05 {

	static void method(boolean b) {
		try {
			System.out.println(1);
			if(b) throw new ArithmeticException(); // true일때 강제로 예외발생
			System.out.println(2);
		} catch(RuntimeException r) {  //RuntimeException이 ArithmeticException의 조상
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

		method(true);   //1, 3, 5 
//		method(false);  //  1,2,5,6,

	}

}
//
//Exception ( IOException , ClassNotFountdException)  -- checked 필수
//RuntimeException( ArithmeticException, ClassCastException, NullPointerException, .....) --unchecked 선택

