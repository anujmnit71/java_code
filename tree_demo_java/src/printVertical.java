/*import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;


class Node{
	int data ;
	Node lChild;
	Node rChild;
	
	Node(){
		this.data = -1;
		this.rChild = null;
		this.lChild = null;
	}
	
	Node(int data ){
		this.data = data;
		this.rChild = null;
		this.lChild = null;
	}
	
	
	static Node insertNode(Node head , int data){
		Node temp = new Node(data);
		
		if(head == null)
			head = temp;
		else if(head.data >= data)
			head.lChild = insertNode(head.lChild , data);
		else
			head.rChild = insertNode(head.rChild , data);
		
		return head;
	}
}


public class printVertical {
	int data;
	
	static void printInVertical(Node head , int level , HashMap<Integer, Integer> map){
		
		Integer val = map.get(level);
		if(val == null )
			map.put(level, head.data);
		else
			map.put(level, head.data + val);
		
		if(head.lChild!= null)
			printInVertical(head.lChild , level - 1 , map);
		if(head.rChild != null)
			printInVertical(head.rChild , level + 1 , map);
		
		
		
	}

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		
		File f = new File("src/ip.txt");
		Scanner scan = new Scanner(f);
		int test  = scan.nextInt();
		while(test>0 ){
			int size = scan.nextInt();
			Node head = null;
			for(int i =0; i< size ; i++){
				head = Node.insertNode(head,scan.nextInt());
			}
			
			System.out.print("Non recursive level order, traversal is \n");
			HashMap<Integer, Integer> map = new HashMap<Integer , Integer>();
			printInVertical(head ,0 , map);
			System.out.println(map.toString());
			test--;
		}
		
		
	}
}

1
13
6 2 7 1 4 8 3 5 12 10 13 9 11*/