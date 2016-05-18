/*import java.io.*;
import java.util.*;


class Solution {
    public int minPatches(int[] nums, int n) {
    	long formed = 0;
    	int added =0 , miss = 1 , i=0;
    	while(formed < n){
    		if(i < nums.length && nums[i] > miss)
    			added++;
    	}
		return added;
    }
}

public class PatchingArray{
	public static void main(String[] args) throws FileNotFoundException{
		final boolean FROM_FILE = true;
		InputStream infile = FROM_FILE?new FileInputStream("src/ipLeetCode") : System.in;
		Scanner scan = new Scanner(infile);
		int test = scan.nextInt();
		scan.next();
		while(test>=0){
			String nums = scan.nextLine();
			int[] arr = Arrays.stream(nums.split("\\s")).mapToInt(Integer::parseInt).toArray();
			int n = scan.nextInt();
			Solution s = new Solution();
			System.out.println(s.minPatches(arr, n));
		}
	}
}
*/