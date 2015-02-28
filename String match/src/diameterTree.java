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
	
	static int diameterNode(Node head , Integer[] height){
		
		if(head == null){
			height[0] = 0;
			return 0;
		}
		
		
		int ldia = diameterNode(head.lChild , height);
		int lheight = height[0];
		
		int rdia = diameterNode(head.rChild , height);
		int rheight = height[0];
		
		height[0] = Math.max(lheight, rheight) + 1;
		int dia = Math.max(Math.max(lheight + rheight + 1, ldia) , rdia);
		
		return dia;
	}
	
}


public class diameterTree {
	
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
			Integer[] height = new Integer[1];
			System.out.println("Diameter of tree is " + Node.diameterNode(head , height));
			System.out.println("Height of tree is " + height[0]);
			test--;
		}
		
		
	}
}


*/