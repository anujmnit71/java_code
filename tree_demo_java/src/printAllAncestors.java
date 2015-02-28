/*import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;


class Node{
	int data ;
	Node lChild;
	Node rChild;
	 static int preindex = 0;	
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
	
	
	static boolean printAllAncestors(Node head , int val){
		if(head == null)
			return false;
		if(head.data == val){
			return true;
		}
		
		if(printAllAncestors(head.lChild , val) || printAllAncestors(head.rChild , val) ){
			System.out.print(head.data + "\t");
			return true;
		}
		else{
			return false;
		}
	}
	
	
}


public class printAllAncestors {
	
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
			int test2 = scan.nextInt();
			
			System.out.print("Inorder traversal is \n");
			head.displayIn();
			System.out.println();
			while(test2>0){
				int val = scan.nextInt();
				System.out.print("Ancestors of "+val +"is " );
				Node.printAllAncestors(head, val );
				System.out.println();
				test2--;
			}
			test--;
		}
		
		
		
	}
}



 
test cases
1
13
6 2 7 1 4 8 3 5 12 10 13 9 11
13
6 2 7 1 4 8 3 5 12 10 13 9 11

*/