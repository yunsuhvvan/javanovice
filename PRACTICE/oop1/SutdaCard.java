package oop1;

//  Ex06_01  

public class SutdaCard {

	int num;
	boolean isKwang;
	
	
	
	public SutdaCard() {
	  this(1 , true);      // this()로 생성자에서 다른 생성자를 호출할 수있다
	  
	  //this는 인스턴스 자신을 가리키는  참조변수,인스턴스의 주소가 저장 되어있다
	  //this()와ths(매개변수)는 생성자,같은 클래스 안에서 다른 생성자 호출할 때 사용
	}
	
	public SutdaCard(int num, boolean isKwang) {
		this.num = num;
		this.isKwang =isKwang;     
	}
	
	String info() {
		  
		
		if(isKwang == true) {
			return num +"K";    //  1k
		} else {
			
			return   num + " " ;   //3 
		}
		
	 }
		 
	 }

	
	
	