

import java.util.*;

public class reverse_stack {
	
	static Stack<Integer> smain = new Stack<Integer>();
	
	static /*public String toString(){
		for(int i = 0 ; i< smin.size() ; i++)
			System.out.println()
		return null;
		
	}*/
	void reverse(Stack<Integer> s){
		if(s.isEmpty())
			return;
		int top = s.peek();
		s.pop();
		reverse(s);
		recursivepush(s,top);
		
		
	}

	private static void recursivepush(Stack<Integer> s, int data) {
		// TODO Auto-generated method stub
		if(s.isEmpty())
			s.push(data);
		else{
			int temp = s.peek();
			s.pop();
			recursivepush(s,data);
			s.push(temp);
		}
			
		
	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int val[] = { 2,6,4,1,5,1,0,1};
		
		
		for(int i : val ){
			smain.push(i);
		}
		System.out.println(smain);
		
		reverse(smain);
		System.out.println(smain);
		
		
	}

}
