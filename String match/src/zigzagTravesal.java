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


public class zigzagTravesal {
	int data;
	
	static void levelTraversal(Node head){
		LinkedList<Node> ll = new LinkedList<Node>();
		ll.add(head);
		LinkedList<Node> visited = new LinkedList<Node>();
		
		Node temp;
		ll.add(null);
		int leftToright = 1;
		while( !ll.isEmpty()){
			
			temp = ll.remove();
			visited.add(temp);
			if(temp == null){
				if(!ll.isEmpty()){
					ll.add(null);
				}
				if(leftToright == 1){
					while(!visited.isEmpty()){
						if( visited.getFirst() != null)
							System.out.print(visited.getFirst().data + "\t");
						visited.removeFirst();
					}
					System.out.println();
					leftToright =  0;
				}
				else{
					while(!visited.isEmpty() ){
						if(visited.getLast() != null)
							System.out.print(visited.getLast().data + "\t");
						visited.removeLast();
					}
					System.out.println();
					leftToright =  1;
				}
			}
			else{
				if(temp.lChild != null)
					ll.add(temp.lChild);
				if(temp.rChild!= null)
					ll.add(temp.rChild);
			}
			//System.out.print(temp.data+ "\t");
			
		}
		
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
			
			System.out.print("Non recursive level order traversal is \n");
			levelTraversal(head);
			System.out.println();
			test--;
		}
		
		
	}
}


1
13
6 2 7 1 4 8 3 5 12 10 13 9 11
*/