
import java.io.*;
import java.util.Scanner;

public class CrazyTree {
	
	static long calBigMultiply(long st , long end ,final long M){
		long result = 1;
		long curr = st;
		while(curr <= end){
			result = (result*(curr%M))%M;
			curr = ( curr +1 )%M;
		}
		return result;
	}
	
	static long findNode(long idx , long curr_l ,final long L, final long M){
		long factor = (long) Math.pow(2, L - curr_l);
		long st = factor*(idx -1 ) +1;
		long end = factor*idx;
		long result = calBigMultiply(st , end , M);
		return result;
	}
	
	public static void main(String args[]) throws Exception {
		final boolean FROM_FILE = true;
		InputStream infile = null;
		try {
			infile = FROM_FILE?new FileInputStream("src/ip.txt") : System.in;
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		BufferedReader br = new BufferedReader(new InputStreamReader(infile));
        String line;// = br.readLine();
		int test  = 1;
		final long M = 1299709;
		while(test > 0){
			test--;
			line = br.readLine(); 
			String[] strs = line.trim().split("\\s+");
			int L = Integer.parseInt(strs[0]);
			long Q = Long.parseLong(strs[1]);
			for(int m=0 ; m < Q ; m++){
				line = br.readLine(); 
				String[] strs1 = line.trim().split("\\s+");
								
				long curr_l = Long.parseLong(strs1[0]);
				long x_st = Long.parseLong(strs1[1]);
				long x_end = Long.parseLong(strs1[2]);
				
				long result = 0;
				for(long curr= x_st ; curr <= x_end ; curr++){
					result = (result + findNode(curr , curr_l , L ,M))%M;
				}
				System.out.println(result);
			}
		}
    }
}
