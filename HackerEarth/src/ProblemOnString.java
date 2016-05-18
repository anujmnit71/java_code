/*import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.Scanner;

public class ProblemOnString {
	static void countChar(String str , char ch1 , char ch2 , int[] res){
		for(char curr : str.toCharArray()){
			if(curr == ch1)
				res[0]++;
			else if(curr == ch2)
				res[1]++;
		}
		return;
	}
	
	public static void main(String args[]) throws FileNotFoundException {
    	final boolean FROM_FILE = true;
		InputStream infile = null;
		try {
			infile = FROM_FILE?new FileInputStream("src/ip.txt") : System.in;
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Scanner scan = new Scanner(System.in);
		int test  = Integer.valueOf(scan.nextLine());
		//long start = System.nanoTime();
		
		while(test > 0){
			test--;
			int len = Integer.valueOf(scan.nextLine());
			String str = scan.nextLine();
			int nq = Integer.valueOf(scan.nextLine());
			//System.out.println("String is "+ str);
			for(int m=0 ; m < nq ; m++){
				String query = scan.nextLine();
				char c1 = query.charAt(0);
				char c2 = query.charAt(2);
				int[] res = new int[2];
				if( c1 == c2){
					countChar(str , c1, (char) 0, res);
					long count = res[0];
					long result = count%2==0 ? ((count/2)*(count-1)) : (((count-1)/2)*count) ;
					System.out.println(result);
				}
				else{
					countChar(str , c1 , c2 , res);
					long result = res[0]*res[1];
					System.out.println(result);
				}
			}
			//long end = System.nanoTime();
			//System.out.println((end-start)/1.0e6 + "ms");
		}
	}
}*/