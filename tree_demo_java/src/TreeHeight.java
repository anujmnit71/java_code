/*import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;
import java.lang.String;


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
	
	void displayIn(){
		if(this.lChild != null)
			this.lChild.displayIn();
		System.out.print(this.data + "\t");
		if(this.rChild != null)
			this.rChild.displayIn();
		
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
	
	static int deepestLeafNode(Node head , Node[] deepestNode){
		int level = deepestLeafNodeUtil(head , 0 , deepestNode);
		System.out.println(deepestNode[0].data + "\t");
		return level;
		
	}
	
	
	static int deepestLeafNodeUtil(Node curr_node , int level , Node[] deepestNode){
		int leftlevel = 0;
		int rightlevel = 0;
		
		if(curr_node.lChild == null && curr_node.rChild == null){
			deepestNode[0] = curr_node;
			return level;
		}
		
		Node deepestLeftNode = null;
		if(curr_node.lChild!= null){
			leftlevel = deepestLeafNodeUtil(curr_node.lChild , level + 1 , deepestNode);
			deepestLeftNode = deepestNode[0];
		}
		Node deepestRightNode = null;
		if(curr_node.rChild!= null){
			rightlevel = deepestLeafNodeUtil(curr_node.rChild , level + 1 , deepestNode );
			deepestRightNode = deepestNode[0];
		}	
		if(leftlevel > rightlevel){
			deepestNode[0] = deepestLeftNode;
			return leftlevel;
		}
		else{
			deepestNode[0] = deepestRightNode;
			return rightlevel;
		}
		
	}
	
}



public class TreeHeight {
	int data;
	static int height;
		
	static int levelTraversal(Node head){
		LinkedList<Node> ll = new LinkedList<Node>();
		ll.add(head);
		ll.add(null);
		Node temp;
		height = 0;
		while( ll.isEmpty()!= true){
			temp = ll.remove();
			if(temp == null){
				height++;
				if(!ll.isEmpty())
					ll.add(null);
				continue;
			}
			if(temp.lChild != null)
				ll.add(temp.lChild);
			if(temp.rChild!= null)
				ll.add(temp.rChild);
			System.out.print(temp.data+ "\t");
			
		}
		return height;
		
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
			int res = levelTraversal(head);
			System.out.println("height is "+ res);
			
			System.out.print("Deepest leaf node is \n");
			Node[] deepestNode = new Node[1];
			int level = Node.deepestLeafNode(head , deepestNode);
			System.out.println("depth is \n"+ level);
			test--;
		}
	}
}
*/