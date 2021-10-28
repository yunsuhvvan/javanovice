package oop3;

public class MinerTest {
	  public static void main(String[] args) {
	    /* 1. 두 갱부 객체를 생성하세요. */
	    Miner malon = new Miner("말런");
	    Miner gloria = new Miner("글로리아");
	    
	    /* 2. 코인을 채굴하세요. */
	    for(int i =0 ; i < 3; i++) {
	    	malon.mine();
	    }
	    for(int i =0 ; i < 2 ; i++) {
	    	gloria.mine();
	    }

	    
	    /* 3. 객체 정보를 출력하세요. */
	    
	    System.out.println(malon);
	    System.out.println(gloria);
	  }
	}

	class Miner {
	  // 필드(인스턴스 변수)
	  String name;
	  int coins;

	  // 생성자
	  public Miner(String str) {
	    name = str;
	    coins = 0;
	  }
	  
	  // 메소드(인스턴스 메소드) - 객체의 정보를 문자열로 반환
	  public String toString() {
	    return String.format("Miner { name: %s, coins: %d }", name, coins);
	  }
	  
	  // 메소드(인스턴스 메소드) - 코인 채굴
	  public void mine() {
	    coins += 1;
	  }
	}
	
	// 실행결과
//	Miner { name: 말런, coins: 3 }
//	Miner { name: 글로리아, coins: 2 }
