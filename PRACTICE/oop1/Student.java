package oop1;

import java.io.ObjectInputStream.GetField;

public class Student {

	//Ex_06_03
	String name;
	int ban;
	int no;
	int kor;                 
	int eng;
	int math;
	
	
	//EX_06_04
	/*
	 * 문제 에서 정의한 클래스에 다음과 같이 정의된 두 개의 메서드
		getTotal()과 getAverage()를 추가하시오  .  
		1. : getTotal 메서드명
		기 능 국어 영어 수학 의 점수를 모두 더해서 반환한다 : (kor), (eng), (math) .
		반환타입 : int
		매개변수 없음 :
		2. : getAverage 메서드명
		기 능 총점 국어점수 영어점수 수학점수 을 과목수로 나눈 평균을 구한다 : ( + + ) .
		소수점 둘째자리에서 반올림할 것.
		반환타입 : float
		매개변수 없음 
	 * 
	 */
	
    int getTotal(){
		
		return kor+eng+math;
	}
	
	float getAverage() {
		
		float i = (float)(getTotal()*100 /3 )/100;   //78.66
		return Math.round(i);
		
//		return  (float)(getTotal()*100/3 )/1000; 
		 
		
		
		
		 
	}
	
	
	//Ex_06_05
	// 다음과 같은 실행결과를 얻도록 Student클래스에 생성자와  info()를 추가하시오  .

	public Student(String name,int ban, int no, int kor, int eng, int math) {
		this.name = name;
		this.ban =ban;
		this.no =no;
		this.eng =eng;
		this.kor =kor;
		this.math = math;
		
		
	}
	
	public  String info(){    //  반환타입이 String
		return name +","+ ban +","+ no +","+ kor +","+ eng +","+math +","+  getTotal()+","+ getAverage();
	}
	
	
	
}
//홍길동,1,1,100,60,76,236,78.7
