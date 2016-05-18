/*// Not complete code brute force can be done by generating all permutations 

import java.io.*;
import java.util.*;

class Solution {
    
	public String reverseShuffle(String str) {
		// TODO Auto-generated method stub
		int[] count = new int[26];
		char[] GenerateStr = new char[str.length()/2];
		for(char ch : str.toCharArray()){
			count[ch-'a']++;
		}
		
		for(int p=0 ; p<count.length ; p++){
			count[p] = count[p]/2;
		}
		int idx=0;
		for(int i = count.length -1 ; i>=0 ; i--){
			int curr = count[i];
			while(curr>0){
				GenerateStr[idx++] = (char) ('a' + i);
				curr--;
			}
		}
		
		return new String(GenerateStr);
	}
}

public class ReverseShuffleMerge{
	public static void main(String[] args) throws FileNotFoundException{
		final boolean FROM_FILE = true;
		InputStream infile = FROM_FILE?new FileInputStream("src/ip.txt") : System.in;
		Scanner scan = new Scanner(infile);
		int test  = Integer.valueOf(scan.nextLine());
		while(test > 0){
			test--;
			String str = scan.nextLine();
			
			//System.out.println("value is " + list + ""+  list.size() );
			Solution s = new Solution();
			long start = System.nanoTime();
			//System.out.println(start);
			System.out.println(s.reverseShuffle(str));
			long end = System.nanoTime();
			System.out.println((end-start)/1.0e6 );
		}
			
	}
}
*/