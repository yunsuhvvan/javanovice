package array;

public class Ex_05_10 {

	public static void main(String[] args) {


		char[] abcCode =
					{ '`','~','!','@','#','$','%','^','&','*',
					'(',')','-','_','+','=','|','[',']','{',
					'}',';',':',',','.','/'};
		
						// 0   1   2   3   4   5   6   7   8   9
		
		char[] numCode = {'q','w','e','r','t','y','u','i','o','p'};
		String src = "abc123";
		
		String result = "";
		// 문자열 src의 문자를 charAt()으로 하나씩 일겅서 변환 후  result에 저장
		for(int i=0; i < src.length();i++) {
			char ch = src.charAt(i); //  변수ch에 값을 저장한것을 보고 힌트를 얻음
			if('a' <= ch && ch <= 'z') {
				result+=abcCode[ch -'a'] ;     
			} else {
				result+=numCode[ch - '0'];
			} 
			
			
			// result+=abcCode 까지는 어떻게 했는데  이후에 [ch-'a']
			// 넣을 생각을 못해서 시간이 오래걸렸습니다.
			// abc123 문자 a , 문자 0.. 경우의 수가 2가지라 
			//else if 조건식은 적지않고 그냥 else만 적었습니다.
			
			
			
		}
		
		System.out.println("src:"+src);
		System.out.println("result:"+result);


	}

}
