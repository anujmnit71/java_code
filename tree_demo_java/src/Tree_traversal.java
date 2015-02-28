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
	
	void displayPre(){
		System.out.print(this.data + "\t");
		if(this.lChild != null)
			this.lChild.displayPre();
		if(this.rChild != null)
			this.rChild.displayPre();
		
	}

	void displayIn(){
		if(this.lChild != null)
			this.lChild.displayIn();
		System.out.print(this.data + "\t");
		if(this.rChild != null)
			this.rChild.displayIn();
		
	}
	
	void displayPost(){
		if(this.lChild != null)
			this.lChild.displayPost();
		
		if(this.rChild != null)
			this.rChild.displayPost();
		System.out.print(this.data + "\t");
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


public class Tree_traversal {
	int data;
	
	static void nonRecursivePreorder(Node head){
		Stack<Node> s = new Stack<Node>();
		
		while(true){
			while(head!=null){
				System.out.print(head.data+"\t");
				s.push(head);
				head = head.lChild;
			}
			if(s.isEmpty())
				break;
			head = s.pop();
			head = head.rChild;
		}
		return;
	}
	
	static void nonRecursiveInorder(Node head){
		Stack<Node> s = new Stack<Node>();
		while(true){
			while(head!=null){
				
				s.push(head);
				head = head.lChild;
			}
		
			if(s.isEmpty())
				break;
			head = s.pop();
			System.out.print(head.data+ "\t");	
			head = head.rChild;
		}
		
	}
	

	static void nonRecursivePostorder(Node head){
		Stack<Node> s = new Stack<Node>();
		while(true){
			while(head!=null){
				head.data = -head.data;
				s.push(head);
				head = head.lChild;
			}
		
			if(s.isEmpty())
				break;
			head = s.pop();
			if(head.data < 0){
				head.data = -head.data;
				s.push(head);
				head = head.rChild;
				
			}
			else{
				System.out.print(head.data+ "\t");
				head = null;
			}
		}
		
	}
	
	static void levelTraversal(Node head){
		LinkedList<Node> ll = new LinkedList<Node>();
		ll.add(head);
		
		Node temp;
		while( ll.isEmpty()!= true){
			temp = ll.remove();
			
			if(temp.lChild != null)
				ll.add(temp.lChild);
			if(temp.rChild!= null)
				ll.add(temp.rChild);
			
			System.out.print(temp.data+ "\t");
			
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
			
			System.out.print("Preorder tree traversal is \n");
			head.displayPre();
			System.out.println();
			
			
			System.out.print("Inorder traversal is \n");
			head.displayIn();
			System.out.println();
			
			
			System.out.print("Postorder traversal is \n");
			head.displayPost();
			System.out.println();
			
			System.out.print("Non recursive Preorder tree traversal is \n");
			nonRecursivePreorder(head);
			System.out.println();
			
			
			System.out.print("Non recursive Inorder traversal is \n");
			nonRecursiveInorder(head);
			System.out.println();
			
			
			System.out.print("Non recursive Postorder traversal is \n");
			nonRecursivePostorder(head);
			System.out.println();
			
			System.out.print("Non recursive level order traversal is \n");
			levelTraversal(head);
			System.out.println();
			test--;
		}
		
		
	}
}




import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;


class Node{
	int data ;
	Node lChild;
	Node rChild;
	Node deepestNode;
	
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
	
	static Node deepestLeafNode(Node head){
		Node[] deepestNode = new Node[1];
		int level = deepestLeafNodeUtil(head , 0 , deepestNode);
		return head.deepestNode;
		
	}
	
	
	static int deepestLeafNodeUtil(Node curr_node , int level , Node[] deepestNode){
		int leftlevel = 0;
		int rightlevel = 0;
		
		if(curr_node.lChild == null && curr_node.rChild == null){
			curr_node.deepestNode = curr_node;
			return level;
		}
		
		Node deepestLeftNode = null;
		if(curr_node.lChild!= null)
			leftlevel = deepestLeafNodeUtil(curr_node.lChild , level + 1 , deepestLeftNode);
		Node deepestRightNode = null;
		if(curr_node.rChild!= null)
			rightlevel = deepestLeafNodeUtil(curr_node.rChild , level + 1 , deepestRightNode );
		if(leftlevel > rightlevel){
			curr_node.deepestNode = curr_node.lChild.deepestNode;
			return leftlevel;
		}
		else{
			curr_node.deepestNode = curr_node.rChild.deepestNode;
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
			//ll.add(null);
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
			Node deepestNode = Node.deepestLeafNode(head);
			System.out.println("deptht is "+ deepestNode.data);
			test--;
		}
	}
}
*/