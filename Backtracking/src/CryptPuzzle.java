import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;
 

class Solve{
	char[] first,second,result;
	Solve(char[] a , char[] b , char[] c){
		first = a;
		second = b;
		result = c;
	}
	
	boolean isSolution(){
		int first = Integer.parseInt(String.valueOf(this.first));
		int second = Integer.parseInt(String.valueOf(this.second));
		int res = Integer.parseInt(String.valueOf(this.result));
		
		return (first + second == res);
	}
	
}

public class CryptPuzzle {

	public static void main(String[] args) throws FileNotFoundException{
		File f = new File("src/ip.txt");
		Scanner scan = new Scanner(f);
		int test  = scan.nextInt() ;
	}
	
}
