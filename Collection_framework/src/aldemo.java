import java.util.Vector;


public class aldemo {

	public static void test(Integer[] a ){
		System.out.print(a);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector<Vector<Integer>> all = new Vector<Vector<Integer>>();
		Vector<Integer>  current= new Vector<Integer>();
		for(int i=0 ; i<10 ; i++)
			current.add(i);
		//System.out.println(aldemo);
		all.add(current);
		all.add(current);
		System.out.print("hellob");
		/*Integer[] a = new Integer[al.size()];
		al.toArray(a);
		aldemo.test(a);
		
		for(int i=0 ; i<10 ; i++)
		System.out.print(a[i]);
		*/
		
	}

}
