

public class passByReferenceInJAVA {
	
	public static void test(Integer[] x){
		x[0] = x[0] + 10;
	}
	public static void main(String[] args){
		// TODO Auto-generated method stub
		Integer[] abc = new Integer[1];
		abc[0] = 10;
		test(abc);
		System.out.println(abc[0]);
		
	}
}

/*
// this wont work
public static void test(Integer x){
	x = x + 10;
	System.out.println(x); // this will print 20 
}
public static void main(String[] args){
	// TODO Auto-generated method stub
	Integer abc = new Integer(10);
	//abc[0] = 10;
	test(abc);
	System.out.println(abc); this will print 10 only not 20
	
}

*/

