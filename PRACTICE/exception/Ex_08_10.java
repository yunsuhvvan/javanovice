package exception;



public class Ex_08_10 {

	public static void main(String[] args) {
		try {
			method1();  //method 1  - method 2 -> nullPointerException발생
			System.out.println(6);//무시
		} catch(Exception e) {
			System.out.println(7);
	}

}

	static void method1() throws Exception {
		try {
			method2();   //method2 - NullpointerException 발생
			System.out.println(1);//무시
		} catch(NullPointerException e) {
			System.out.println(2);  //처리
			throw e;             // 아빠와 딸 심부름 생각하기.
		} catch(Exception e) {
			System.out.println(3);
		} finally {
			System.out.println(4);   // 출력 후 메인메소드 
		}
		System.out.println(5);
	} // method1()
	static void method2() {
		throw new NullPointerException();
	}
}

//2,4,7