import java.io.*;
import java.util.*;

class Solution {
    public String fractionToDecimal(long num1, long num2) {
        String result = "";
        if(num1 * num2 < 0)
            result = result + "-";
        long num = num1, den = num2;
    	num = Math.abs(num1);
    	den = Math.abs(num2);

        result  =  result + num/den;
        long rem = (num%den)*10;
        if(rem == 0)
            return result;
        result = result + ".";
        HashMap<Long , Integer> remidx = new HashMap<Long,Integer>();
        while(rem != 0){
            if(remidx.containsKey(rem)){
                int idx = remidx.get(rem);
                result = result.substring(0,idx-1) + "(" + result.substring(idx-1) + ")";
                break;
            }
            result = result + rem/den;
            remidx.put(rem , result.length());
            rem = (rem%den) *10;
      
        }
        return result;
    }
}
public class FractionToDecimal{
	public static void main(String[] args) throws FileNotFoundException{
		final boolean FROM_FILE = true;
		InputStream infile = FROM_FILE?new FileInputStream("src/ipLeetCode") : System.in;
		Scanner scan = new Scanner(infile);
		int test = scan.nextInt();
		while(test > 0 ){
			test--;
			long num1 = scan.nextLong();
			long num2 = scan.nextLong();
			Solution s = new Solution();
			System.out.println("solution is " + s.fractionToDecimal(num1, num2));
		}
	}
}
