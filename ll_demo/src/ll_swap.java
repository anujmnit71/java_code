/*import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class ll_swap {
	
	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		
		File f = new File("src/ip.txt");
		Scanner scan = new Scanner(f);
		int test  = scan.nextInt();
		while(test>0 ){
			int size = scan.nextInt();
			LinkedList<Integer> ll = new LinkedList<Integer>();
			for(int i =0; i< size ; i++){
				ll.add(scan.nextInt());
			}
			
			LinkedList<Integer> ll_odd = new LinkedList<Integer>();  
			LinkedList<Integer> ll_even = new LinkedList<Integer>();
			Iterator itr = ll.iterator();
			Iterator itr_odd = ll_odd.iterator();
			Iterator itr_even = ll_odd.iterator();
			
			ll_odd.add((Integer) itr.next());
			
			while(itr.hasNext()){
				
				ll_even.addFirst((Integer) itr.next());
				if(itr.hasNext())
					ll_odd.add((Integer) itr.next());
			}
			ll_odd.addAll(ll_even);
			System.out.println(ll_odd);
			test--;
		}

		File f = new File("src/ip.txt");
		Scanner scan = new Scanner(f);
		int test  = scan.nextInt();
		while(test>0 ){
			int size = scan.nextInt();
			LinkedList<Integer> ll = new LinkedList<Integer>();
			LinkedList<Integer> ll_even = new LinkedList<Integer>();
			for(int i =0; i< size ; i++){
				ll.add(scan.nextInt());
			}
			
			Iterator itr = ll.iterator();
			//Iterator itr_odd = ll.iterator();
			Iterator itr_even = ll_even.iterator();
			
			
			while(itr.hasNext()){
				temp = itr.next();
				ll_even.addFirst((Integer) itr.next());
				if(itr.hasNext())
					ll_odd.add((Integer) itr.next());
			}
			
			ll_odd.addAll(ll_even);
			System.out.println(ll_odd);
			test--;
		}
	}
}
*/