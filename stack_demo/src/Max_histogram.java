import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.*;

public class Max_histogram {
	int[] val;
	static int[] area;
	Stack<Integer> ss;
	
	Max_histogram(int size){
		val = new int[size];
		area = new int[size];
		ss = new Stack<Integer>();
		for(int i=0 ; i<area.length ; i++){
			area[i] = 0;
		}
			
	}
	
	
	void areaFinder(){
		int left = -1;
		for(int i=0 ; i<val.length ; i++){
			if(ss.isEmpty() || val[ss.peek()] <= val[i]){
				//ss.pop();
				ss.push(i);
			}
			else{
				while(!ss.isEmpty() && val[ss.peek()] > val[i]){
					int index = ss.peek();
					ss.pop();
					if(!ss.isEmpty()){
						left = ss.peek();
					}
					else
						left = -1;
					area[index] = val[index] * (i - left -1);
				}
				ss.push(i);
				
			}
		}
		while(!ss.isEmpty() ){
			int index = ss.peek();
			ss.pop();
			left = -1;
			if(!ss.isEmpty())
				left = ss.peek();
			area[index] = val[index] * (val.length - left -1);
		}
		
	}

	
	
	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		
		File f = new File("src/ip.txt");
		Scanner scan = new Scanner(f);
		int test  = scan.nextInt();
		while(test>0 ){
			int size = scan.nextInt();
			Max_histogram sf = new Max_histogram(size);
			for(int i =0; i< size ; i++){
				sf.val[i] = scan.nextInt();
			}
			
			System.out.println("Area list");
			sf.areaFinder();
			for(int i =0; i< size ; i++){
				System.out.print(Max_histogram.area[i] + "    ");
			}
			System.out.println();
			int max = 0;
			for(int i=0; i < sf.val.length ; i++){
				if(max < Max_histogram.area[i])
					max = Max_histogram.area[i];
			}
			System.out.println("Max area is " + max);
			test--;
		}
		
		
	}
}
