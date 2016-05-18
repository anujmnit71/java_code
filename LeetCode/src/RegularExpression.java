/*import java.io.*;
import java.util.*;

class Solution {
	public boolean isMatch(String s, String p) {
	    if(p.length() ==0 )
	        return s.length() == 0;
		if((s.length() == 0 && p.length() !=0 ) || (s.length() != 0 && p.length() ==0 ) )
			return false;
		
        if(p.length() == 1){
            if (s.length() < 1) 
		    	return false;
		    return (p.charAt(0) == s.charAt(0) || p.charAt(0) == '.') && s.length() == 1;
        }
        	
        
        if(p.charAt(1) == '*'){
        	//take 0 characters from '*'
        	if (isMatch(s, p.substring(2))) {
    			return true;
    		}
     
    		//take one or more characters using '*' can stand for 1 or more preceding element, 
    		//so try every sub string
            for(int i=0 ; i<s.length() && ( (p.charAt(0) == '.' || p.charAt(0) == s.charAt(i) )); i++){
	            if(isMatch(s.substring(i+1) , p.substring(2)))
		            return true;
            }
            return false;
        }
        else{
            if (s.length() < 1)
			    return false;
            
        	if(p.charAt(0) == '.' || p.charAt(0) == s.charAt(0))
        		return isMatch(s.substring(1) , p.substring(1));
        	else
        		return false;
        }
    }

}
public class RegularExpression{
	public static void main(String[] args) throws FileNotFoundException{
		final boolean FROM_FILE = true;
		InputStream infile = FROM_FILE?new FileInputStream("src/ipLeetCode") : System.in;
		Scanner scan = new Scanner(infile);
		int test  = Integer.valueOf(scan.nextLine());
		while(test > 0){
			test--;
			String BeginWord = scan.nextLine();
			String EndWord = scan.nextLine();
			
			Solution s = new Solution();
			long start = System.nanoTime();
			System.out.println(start);
			System.out.println("solution is " + s.isMatch(BeginWord, EndWord));
			long end = System.nanoTime();
			System.out.println((end-start)/1.0e6 );
		}
			
	}
}
*/