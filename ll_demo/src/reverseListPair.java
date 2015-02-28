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

public class reverseListPair {
	
	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		
		
		File f = new File("src/ip.txt");
		Scanner scan = new Scanner(f);
		int test  = scan.nextInt();
		
		while(test>0 ){
			Node head = new Node();
			Node newNode;
			int size = scan.nextInt();
			head.data = scan.nextInt();
			Node temp = head;
			
			for(int i =1; i< size ; i++){
				newNode = new Node(scan.nextInt());
				temp.next = newNode;
				temp = temp.next;
				
			}
			
			head = reverseListIter(head);
			display(head);
			test--;
		}
	}

	static void display(Node head){
		while(head!= null){
			System.out.print(head.data + "\t");
			head = head.next;
		}
		System.out.println();
	}
	
	private static Node reverseListIter(Node head) {
		Node p,q, tempprev;
		p = q = head;
		tempprev = null;
		if(p.next!= null)
			head = p.next;
		while(p!= null && p.next != null){
			p = q.next;
			q.next = p.next;
			p.next = q;
			if(tempprev != null)
				tempprev.next = p;
			tempprev = q;
			p = q.next;
			q = p;
		}
		
		return head;
		
	}
	
	private static Node reverseListRec(Node head) {
		Node p,q, temp;
		p = q = head;
		if(head== null)
			return null;
		if(p.next != null){
			head = p.next;
			p = q.next;
			q.next = p.next;
			p.next = q;
			q.next = reverseListRec(q.next);
		}
		
		return head;
	}
		
}
*/