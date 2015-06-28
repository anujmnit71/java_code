/* IMPORTANT: class must not be public. */

import java.io.File;
import java.io.FileReader;
import java.util.Collections;
import java.util.Scanner;
import java.util.Vector;
import java.net.*;

class Pair implements Comparable{
	public int first;
	public int second;

	Pair(int first, int second) {
		this.first = first;
		this.second = second;
	}


	@Override
	public int compareTo(Object obj) {
		Pair o = (Pair)obj;
		int cmp = o == null ? 1 : (this.first - o.first);
		return cmp == 0 ? (this.second - o.second) : cmp;
	}
	
	public String toString() {
		return this.first + " " + this.second;
	}
}

public class Code {
    @SuppressWarnings("null")
	public static void main(String args[] ) throws Exception {
    	File f = new File("src/ipCode");
		FileReader fr = new FileReader(f);
		Scanner scan = new Scanner(f);
		int test  = scan.nextInt();
		
		while(test>0 ){
			Vector<Pair> pair = new Vector<Pair>();
			int depth[][] = {
								{1,1,1,1,1},
								{1,2,2,2,1},
								{1,2,3,2,1},
								{1,2,2,2,1},
								{1,1,1,1,1},
							};
			
			for(int i = 0 ; i < 5 ; i ++){
				Pair p = new Pair(scan.nextInt() - 1 , scan.nextInt() - 1);

				pair.add(p);
			}
			Collections.sort(pair);
			int a = pair.get(0).first ;
			test--;
		}
    }
}