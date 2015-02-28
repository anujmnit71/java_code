/*import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

class Node{
	int data ;
	Node next;
	Node(){
		this.data = -1;
		this.next = null;
	}
	Node(int data ){
		this.data = data;
		this.next = null;
	}
	
}

public class findMiddle {
	
	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		
		
		File f = new File("src/ip.txt");
		Scanner scan = new Scanner(f);
		int test  = scan.nextInt();
		Node head = new Node();
		Node newNode;
		while(test>0 ){
			int size = scan.nextInt();
			head.data = scan.nextInt();
			Node temp = head;
			
			for(int i =1; i< size ; i++){
				newNode = new Node(scan.nextInt());
				temp.next = newNode;
				temp = temp.next;
				
			}
			
			Node middle = findMiddle(head);
			System.out.println("Middle is " + middle.data);
			test--;
		}
	}

	private static Node findMiddle(Node head) {
		// TODO Auto-generated method stub
		Node fastptr = null;
		Node slowptr = null;
		Node temp;
		fastptr = temp = head;
		slowptr = temp;
		while(fastptr!=null && slowptr!=null){
			slowptr = temp;
			temp = temp.next;
			fastptr = fastptr.next;
			
			if(fastptr!=null )
				fastptr = fastptr.next;
		}
			
		return slowptr;
	}
		
}
*/