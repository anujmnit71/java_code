import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.lang.Object;


public class prog1 {

    public static void main(String[] args) throws FileNotFoundException{
         //Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. 
        Scanner s = new Scanner(new File("src/ip_Practice.txt"));
		
        int test = s.nextInt();
        while( test-- > 0){
	        int sizearr = s.nextInt();
	        List<List<Integer> > allList = new ArrayList<List<Integer> >();
	        for(int i = 0 ; i < sizearr ; i++){
	        	List<Integer> currList = new ArrayList<Integer>();
	        	for(int j = 0 ; j <= i ; j++){
	        		currList.add(s.nextInt());
	        	}
	        	allList.add(currList);
	        }
	        
        }
    }
}