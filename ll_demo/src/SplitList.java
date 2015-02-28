import java.io.File;
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

public class SplitList {
	
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
			
			Node middle = findMiddle(head);
			Node head2 = null;
			if(middle != null && middle.next!=null){
				head2 = middle.next;
				
				Node templist2 = head2;
				while(templist2.next != null){
					templist2 = templist2.next;
				}
				templist2.next = head2;
			}
			middle.next = head ;// make list as circular 
			display(head);
			System.out.print("List 2 :\n");
			if(head2!=null)
				display(head2);
			System.out.println();
			System.out.println();
			test--;
		}
	}

	static void display(Node head){
		Node temp = head;
		while(temp.next!= head){
			System.out.print(temp.data + "\t");
			temp = temp.next;
		}
		System.out.println(temp.data);
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
