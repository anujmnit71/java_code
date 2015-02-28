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
	
	static int printAllPath(Node head , Integer[] path , int index ){
		
		if(head.lChild == null && head.rChild == null){
			path[index] = head.data;
			
			for(int i=0 ; i<=index ; i++)
				System.out.print(path[i] + "\t");
			System.out.println();
			return 0;
		}
		path[index] = head.data;
		if(head.lChild !=null)
			printAllPath(head.lChild , path , index + 1);
		
		if(head.rChild !=null)
			printAllPath(head.rChild , path , index + 1);
		
		return 0;
	}
	
}


public class printAllPath {
	
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
			
			System.out.print("Inorder traversal is \n");
			head.displayIn();
			System.out.println();
			Integer[] height = new Integer[100];
			System.out.println("Diameter of tree is " + Node.printAllPath(head , height , 0));
			System.out.println("Height of tree is " + height[0]);
			test--;
		}
		
		
	}
}


*/