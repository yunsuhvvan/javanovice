package collection;

import java.util.*;
class Ex_11_02 {
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add(3); //3
		list.add(6); //36
		list.add(2); //362
		list.add(2); //3622     순서 o 중복 o
		list.add(2); //36222
		list.add(7); //362227
		
		HashSet set = new HashSet(list);  //set은 순서 x 중복 x..  3627 을 랜덤
		TreeSet tset = new TreeSet(set);  //  중복 x 오름차순..
		Stack stack = new Stack();		//
		stack.addAll(tset);				//
		while(!stack.empty())   // stack이 empty가 아니면
			System.out.println(stack.pop());  //pop..은 마지막부터
	}
}
  

//treeset stack  개념 부족 
// pop 마지막 요소부터 , push 첫 요소부터,,