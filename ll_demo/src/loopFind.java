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

public class loopFind {
	
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
			Node p = head;
			for(int i=1 ; i < size/2 ; i++){
				p = p.next;
			}
			temp.next = p;
			
			Node loop = findLoop(head);
			if(loop != null)
				System.out.println(loop.data + "      " + p.data);
			else
				System.out.println("No loop ");
			test--;
		}
	}

	private static Node findLoop(Node head) {
		// TODO Auto-generated method stub
		Node fastptr = null;
		Node slowptr = null;
		fastptr = slowptr = head;
		boolean loop = false;
		
		while(fastptr!=null && slowptr!=null){
			slowptr = slowptr.next;
			fastptr = fastptr.next;
			
			if(fastptr!=null && fastptr.next != null)
				fastptr = fastptr.next;
			else{
				loop = false;
				break;
			}
			
			if(fastptr == slowptr){
				loop = true;
				break;
			}
		}
		
		if( loop ){
			slowptr = head;
			while(fastptr != slowptr){
				slowptr = slowptr.next;
				fastptr = fastptr.next;
			}
		}
		else
			slowptr = null;
		int count = 1;
		slowptr = slowptr.next;
		while(slowptr != fastptr){
			slowptr = slowptr.next;
			count++;
		}
		System.out.println("Loop size is " + count);
		return slowptr;
	}
}
*/