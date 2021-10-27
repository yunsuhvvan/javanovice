package exception;

public class Ex_08_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
//	[8-4] 다음과 같은 메서드가 있을 때, 예외를 잘못 처리한 것은? (모두 고르시오)
//	void method() throws InvalidNumberException, NotANumberException {}
//	class NumberException extends RuntimeException {}
//	class InvalidNumberException extends NumberException {}
//	class NotANumberException extends NumberException {}
//	
//	a. try {method();} catch(Exception e) {}
//	b. try {method();} catch(NumberException e) {} catch(Exception e) {}
//	c. try {method();} catch(Exception e) {} catch(NumberException e) {}
//	d. try {method();} catch(InvalidNumberException e) {
//	} catch(NotANumberException e) {}
//	e. try {method();} catch(NumberException e) {}
//	f. try {method();} catch(RuntimeException e) {}
	
	// 답:  c

//어떤 오류가 발생했는지 확인하기 위해서!
//위에 상위 예외 처리를 해버리면 이게 어떤 예외인지  모르고 그냥
//예외처리가 되어 버리기 때문에 조금 더 상세한 오류를 확인하기 위해서
//	
