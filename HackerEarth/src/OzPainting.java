/*import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.Scanner;

public class OzPainting {
	public static void main(String args[]) {
		final boolean FROM_FILE = true;
		InputStream infile = null;
		try {
			infile = FROM_FILE?new FileInputStream("src/ip.txt") : System.in;
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Scanner scan = new Scanner(infile);
		int test  = Integer.valueOf(scan.nextLine());
		long start = System.nanoTime();
		
		while(test > 0){
			test--;
			int w = scan.nextInt();
			int r = scan.nextInt();
			int g = scan.nextInt();
			int result = w/3 + r/3 + g/3 + Math.min(Math.min(w%3, r%3) , g%3);
			System.out.println(result);
		}
		long end = System.nanoTime();
		System.out.println((end-start)/1.0e6 + "ms");

    }
}

import java.util.Scanner;

public class OzPainting{
	public static boolean testSpecial(long w , long r , long g) {
		if((	(w %3 + r%3 ==4) && (g%3 ==0)	)||
			(	(g %3 + w%3 ==4) && (r%3 ==0)	)||
			(	(r %3 + g%3 ==4) && (w%3 ==0)	))
				return true;
		return false;
	}
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		int test  = Integer.valueOf(scan.nextLine());
		long start = System.nanoTime();
		while(test > 0){
			test--;
			long w = scan.nextLong();
			long r = scan.nextLong();
			long g = scan.nextLong();

			long result1 = w/3 + r/3 + g/3 + Math.min(Math.min(w%3, r%3) , g%3);
			if( testSpecial(w,r,g) == true){
				result1 = result1 + 1;
			}
			long minval = Math.min(Math.min(w, r) , g);
			long result2 = minval + ((w-minval)/3 +(r-minval)/3 + (g-minval)/3 );
			long ans = Math.max(result1 , result2);
			System.out.println(ans);
		}
		
    }
}*/