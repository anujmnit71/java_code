/*import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;


class ListNode{
	int val;
	ListNode next;
	ListNode(int val){
		this.val = val;
		this.next = null;
	}
}


public class mergeKsortedList{
	
	public static void main(String[] args) throws FileNotFoundException{
		File f = new File("src/ip.txt");
		Scanner scan = new Scanner(f);
		int nList  = scan.nextInt() ;
		ArList<ListNode> klists = new List<ListNode>();
		while(nList>0 ){
			int list_size = scan.nextInt();
			Vertex parent = myset.makeUnion(myset.vlist[a] , myset.vlist[b]);
			System.out.println("Parent is " + parent.id + " rank is " + parent.rank);
			test--;
		}
		while(test > 0){
			int a = scan.nextInt();
			Vertex parent = myset.findSet(myset.vlist[a]);
			System.out.println("Parent is " + parent.id + " rank is " + parent.rank);
			test--;
		}	
		
		System.out.println("Path length to root ");
		for(int i=0 ; i < test2 ; i++){
			System.out.println("Paht of vertex " + i);
			Vertex  v= myset.vlist[i];
			myset.getPath(v);
		}
		
	}
	
}*/