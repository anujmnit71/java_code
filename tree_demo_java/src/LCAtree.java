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
	
	
	static boolean findLCA(Node head , int a , int b){
		if(head == null)
			return false;
		if(  ((head.data == a ) && ( (findLCA(head.lChild , a ,b) || findLCA(head.rChild ,a , b) ) ))   
				|| ((head.data == b ) && ( (findLCA(head.lChild , a ,b) || findLCA(head.rChild ,a , b) ) ))  ){
			System.out.println("Ancestor is " + head.data + "\t");
			return true;
		}
		
		if(head.data == a || head.data == b)
			return true;
		
		if(findLCA(head.lChild , a , b) && findLCA(head.rChild , a , b) ){
			System.out.println("Ancestor is " + head.data + "\t");
			return true;
		}
		
		if(findLCA(head.lChild , a , b) || findLCA(head.rChild , a  ,b))
			return true;
		else
			return false;
		
	}
	
	// it assumes that the values are present in the tree otherwise wrong ans 
	static Node findLCA(Node head , int a , int b){
		if(head == null)
			return head;
		if(head.data == a || head.data == b)
			return head;
		
		Node left = findLCA(head.lChild , a , b) ;
		Node right = findLCA(head.rChild , a , b) ;
		if(left!=null && right!=null ){
			return head;
		}
		
		else
			return left!=null ? left : right;
	}
	
	
}


public class LCAtree {
	
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
				int val1 = scan.nextInt();
				int val2 = scan.nextInt();
				System.out.print("Ancestors of "+val1 + "and "+ val2 + "is " );
				Node ancestor = Node.findLCA(head, val1 , val2 );
				System.out.println(ancestor.data);
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

1
13
6 2 7 1 4 8 3 5 12 10 13 9 11
5
2 10
1 4
12 9
12 13
2 7
*/