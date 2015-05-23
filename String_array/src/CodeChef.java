import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Vector;
     
     
class CodeChef {
	public static void main(String[] args) throws FileNotFoundException {
		//File f = new File("input.txt");
		//Scanner sc = new Scanner(f);
		Scanner sc = new Scanner(System.in);
		String str;
    	long test,st , end;
    	char first , second;
    	str = sc.nextLine();
    	test = sc.nextLong();
    	//System.out.println(str + " " + test);
    	preprocess(str);
    	while(test-- > 0){
    		first = sc.next().charAt(0);
    		second = sc.next().charAt(0);
    		st = sc.nextLong();
    		end = sc.nextLong();
    		int countfirst = 0;
    		int count = 0;
    		
    		
    		//System.out.println(first + " " + second + " " + st + " " +end );
    		
    		System.out.println(count);
    	}
    	sc.close();
    }

	private static void preprocess(String str) {
		// TODO Auto-generated method stub
		HashMap<Character , Vector<Vector<Integer> > > mymap = new HashMap<Character , Vector<Vector<Integer> > >();
		Vector<Vector<Integer> > vforc = new Vector<Vector<Integer> >();
		Vector<Vector<Integer> > vforh = new Vector<Vector<Integer> >();
		Vector<Vector<Integer> > vfore = new Vector<Vector<Integer> >();
		Vector<Vector<Integer> > vforf = new Vector<Vector<Integer> >();
		
 		for(int i = 0 ; i < str.length() ; i++){
			//mymap.put(str.charAt(i), arg1)
		}
	}

}



/*
for(int i = (int) (st -1) ; i < end ; i++){
	if(str.charAt(i) == first)
		countfirst++;
	if(str.charAt(i) == second)
		count += countfirst;
}*/