

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.*;

public class span_finding {
	int[] val;
	int[] span;
	int[] span_simple;
	Stack<Integer> ss;
	span_finding(int size){
		val = new int[size];
		span = new int[size];
		span_simple = new int[size];
		ss = new Stack<Integer>();
		for(int i=0 ; i<span.length ; i++)
			span[i] = 1;
	}
	
	void spanfinder_simple(){
		span_simple[0] = 1;
		int j = 1;
		for(int i=1 ; i<val.length ; i++){
			j = 1;
			while(i>=j && val[i] > val[i-j] )
				j++;
			span_simple[i] = j;
		}
	}
	
	void spanFinder(){
		for(int i=0 ; i<val.length ; i++){
			if(ss.isEmpty() || val[ss.peek()] >= val[i]){
				//ss.pop();
				ss.push(i);
			}
			else{
				while(!ss.isEmpty() && val[ss.peek()] < val[i]){
					int index = ss.peek();
					ss.pop();
					span[i] = span[i] + span[index];
				}
				ss.push(i);
			}
		}
	}

	
	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		
		File f = new File("src/ip.txt");
		FileReader fr = new FileReader(f);
		Scanner scan = new Scanner(f);
		int test  = scan.nextInt();
		while(test>0 ){
			int size = scan.nextInt();
			span_finding sf = new span_finding(size);
			for(int i =0; i< size ; i++){
				sf.val[i] = scan.nextInt();
			}
			System.out.println("Efficient method");
			sf.spanFinder();
			for(int i =0; i< size ; i++){
				System.out.print(sf.span[i] + "    ");
			}
			System.out.println();
			System.out.println("Ad hoc method ");			
			sf.spanfinder_simple();
			for(int i =0; i< size ; i++){
				System.out.print(sf.span_simple[i] + "    ");
			}
			System.out.println();
			
			test--;
		}
		
		
	}
}
