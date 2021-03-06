

import java.util.*;

public class minStack {

	Stack<Integer> smin = new Stack<Integer>();
	Stack<Integer> sreg = new Stack<Integer>();
	
	/*public String toString(){
		for(int i = 0 ; i< smin.size() ; i++)
			System.out.println()
		return null;
		
	}*/
	void push(int val){
		sreg.push(val);
		if(smin.empty() || smin.peek() >= val){
			smin.push(val);
		}
		//else 
			//smin.push(smin.peek());
		
	}

	int pop(){
		int val = sreg.peek();
		sreg.pop();
		int minval = smin.peek();
		if(val == minval)
			smin.pop();
		return val;
		
	}
	
	int retMin(){
		return smin.peek();
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int val[] = { 2,6,4,1,5,1,0,1};
		minStack s = new minStack();
		
		for(int i : val ){
			s.push(i);
		}
		System.out.println(s);
		
		for(int i : val ){
			s.pop();
		}
		
	}

}
